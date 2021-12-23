package com.javabasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class EmwitSpringApplication {

    public static ConfigurableApplicationContext mCtx;
    public static void main(String[] args) {

        mCtx =   SpringApplication.run(EmwitSpringApplication.class, args);

    }



}
