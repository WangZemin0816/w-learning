package com.wangzemin.learning.tomcat.cp2;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Wang Zemin(i539974)
 */
public class HttpServer1 {

    public static final String WEB_ROOT = System.getProperty("user.dir")+"/java-base/java-tomcat/src/main/resources";

    private static final String  SHUTDOWN_COMMAND = "/SHUTDOWN";

    private boolean shotdown = false;

    public static void main(String[] args) throws IOException {
        HttpServer1 httpServer = new HttpServer1();
        httpServer.await();
    }

    public void await() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        int port = 8090;
        try{
            serverSocket = new ServerSocket(port,1, InetAddress.getByName("127.0.0.1"));
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

        while (!shotdown){
            Socket socket = null;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try{
                socket = serverSocket.accept();
                inputStream = socket.getInputStream();
                outputStream = socket.getOutputStream();
                Request request = new Request(inputStream);
                request.parse();

                Response response = new Response(outputStream);
                response.setRequest(request);

                if (request.getUri().startsWith("/servlet/")){
                    ServletProcessor1 processor = new ServletProcessor1();
                    processor.process(request,response);
                }else {
                    StaticResourceProcessor processor = new StaticResourceProcessor();
                    processor.process(request,response);
                }

                socket.close();
                shotdown = request.getUri().equals(SHUTDOWN_COMMAND);
            }catch (Exception e){
                e.printStackTrace();
                continue;
            }
        }
    }
}
