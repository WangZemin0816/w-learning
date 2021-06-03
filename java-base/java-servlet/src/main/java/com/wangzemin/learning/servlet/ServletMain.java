package com.wangzemin.learning.servlet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * @author Wang Zemin(i539974)
 */
public class ServletMain {
    public static void main(String[] args) throws LifecycleException {
        long start = System.currentTimeMillis();
        // 设置端口
        int port = 8888;
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(port);

        // 添加listener
        StandardServer server = (StandardServer) tomcat.getServer();
        AprLifecycleListener listener = new AprLifecycleListener();
        server.addLifecycleListener(listener);

        // 设置contextPath和路径
        String contextPath = "/ee-tomat-embed";
        String docBase = new File("webapp").getAbsolutePath();
        Context context = tomcat.addWebapp(contextPath, docBase);
        System.out.println("添加contextPath和docBase是:" + contextPath + "==>" + docBase);

        // add servlet
        // Context context = tomcat.addContext(contextPath, baseDir);
        String servletName = "hello";
        String servletMapping = "/hello";
        tomcat.addServlet(contextPath, servletName, new HelloServlet());
        context.addServletMappingDecoded(servletMapping, servletName);
        // 启动tomcat
        tomcat.start();
        long end = System.currentTimeMillis();
        System.out.println("启动完成,共使用了:" + (end - start) + "ms");
        // 进入监听状态,如果不进入监听状态,启动tomat后就会关闭tomcat
        tomcat.getServer().await();
    }

}
