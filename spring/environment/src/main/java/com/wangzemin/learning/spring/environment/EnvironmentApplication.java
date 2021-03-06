package com.wangzemin.learning.spring.environment;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class EnvironmentApplication {

    public static void main(String[] args) {
        //        ConfigurableEnvironment environment = new StandardEnvironment();
//        MutablePropertySources propertySources = environment.getPropertySources();
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("xyz", "myValue");
//        propertySources.addFirst(new MapPropertySource("MY_MAP", myMap));

        System.setProperty("spring.profiles.active", "test,test1");
//        System.setProperty("spring.application.json","{\"aaaaaaa\":\"bbbbbbb\"}");
        SpringApplication application = new SpringApplicationBuilder(EnvironmentApplication.class).application();
        Map<String, Object> myMap = new HashMap<>();
        myMap.put("xyz", "myValue");
        application.setDefaultProperties(myMap);
        application.run(args);
        ConfigFileApplicationListener r;
        SpringApplication.run(EnvironmentApplication.class);
    }
}
