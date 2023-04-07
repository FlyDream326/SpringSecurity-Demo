package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsjApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsjApplication.class,args);
        System.out.println("http://localhost:8080");
    }

}
