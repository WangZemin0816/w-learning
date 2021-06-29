package com.wangzemin.learning.tomcat.cp1;

import java.io.*;

/**
 * @author Wang Zemin(i539974)
 */
public class Response {
    private static final int BUFFER_SIZE = 1024;

    private Request request;
    private OutputStream outputStream;

    public Response(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void sendStaticResource() throws IOException {
        byte[] bytes = new byte[BUFFER_SIZE];
        FileInputStream fileInputStream = null;
        try {
            File file = new File(HttpServer.WEB_ROOT, request.getUri());
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                int ch = fileInputStream.read(bytes, 0, BUFFER_SIZE);
                while (ch != -1) {
                    outputStream.write(bytes, 0, ch);
                    ch = fileInputStream.read(bytes, 0, BUFFER_SIZE);
                }
            }else{
                String error = "HTTP/1.1 404 File Not Find\r\nContent-Type: text/html\r\n" +
                        "Content-Length: 23\r\n\r\n<h1>File Not Find</h1>";
                outputStream.write(error.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream!=null){
                fileInputStream.close();
            }
        }
    }
}
