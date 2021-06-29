package com.wangzemin.learning.tomcat;

import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.CoyoteAdapter;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.JreMemoryLeakPreventionListener;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.ThreadLocalLeakPreventionListener;
import org.apache.catalina.startup.VersionLoggerListener;
import org.apache.coyote.Processor;
import org.apache.coyote.ProtocolHandler;
import org.apache.tomcat.util.net.AbstractEndpoint;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Wang Zemin(i539974)
 */
public class PrimitiveServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("Hello. Roses are red.");
        printWriter.println("Violets are blue.");
    }

    @Override
    public String getServletInfo() {
        Connector connector;
        Server server;
        Processor p;
        AbstractEndpoint endpoint;
        AbstractEndpoint abstractEndpoint;
        ProtocolHandler handler;
        Wrapper ss;
        Context context;
        Loader loader;
        ClassLoader classLoader;
        Thread.currentThread().getContextClassLoader();


        Engine e;
        Servlet s;
        Container container;
        ThreadLocalLeakPreventionListener 跑;
        JreMemoryLeakPreventionListener s1;
        Runtime.getRuntime().addShutdownHook(new Thread());
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
