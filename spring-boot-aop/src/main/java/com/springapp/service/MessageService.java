package com.springapp.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {


    public String message(String param){
        System.out.println("method message: "+ param);
        return param;
    }

}
