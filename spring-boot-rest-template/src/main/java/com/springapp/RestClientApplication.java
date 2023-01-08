package com.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class RestClientApplication{


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    public static void main( String[] args ) {

        SpringApplication.run(RestClientApplication.class, args);

    }
}
