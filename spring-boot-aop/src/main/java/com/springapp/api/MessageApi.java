package com.springapp.api;

import com.springapp.service.MessageService;
import com.springapp.service.MessageService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessageService messageService;

    @Autowired
    private MessageService2 messageService2;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        messageService2.messageMethod2(message);
        return ResponseEntity.ok(messageService.message(message));
    }



// // https://www.youtube.com/watch?v=3RrvCEoKpcM&list=PLd0jsEi3hUAfg1-tqxFvDA9q-kpZ4q4uE&index=13&ab_channel=HaydiKodlayalim




}
