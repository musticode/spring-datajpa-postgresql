package com.springapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * graphqlResolver --> api üzerinde sorgulama yapabilme
 * mutationResolver --> sunucudaki kayıtların değiştirilmesi
 */


@SpringBootApplication
public class GraphQlApplication {
    public static void main( String[] args ){
        SpringApplication.run(GraphQlApplication.class, args);
    }
}
