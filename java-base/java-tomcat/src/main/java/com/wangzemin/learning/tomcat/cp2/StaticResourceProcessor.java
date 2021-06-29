package com.wangzemin.learning.tomcat.cp2;


import java.io.IOException;

/**
 * @author Wang Zemin(i539974)
 */
public class StaticResourceProcessor {
    public void process(Request request, Response response) {
        try{
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
