package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello in log");
    }

    public CommandLineRunner commandLineRunner(ApplicationContext context){
        return args -> {
            System.out.println("Beans are as following --");
            Set<String> beanNames = context.getResourcePaths("/hello");
            for ( String atrName:beanNames){
                System.out.println(atrName);
            }
        };
    }

}
