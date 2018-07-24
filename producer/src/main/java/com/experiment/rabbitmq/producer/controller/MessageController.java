package com.experiment.rabbitmq.producer.controller;

import com.experiment.rabbitmq.producer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping
    public String sendMessage() {
        return messageService.sendMessage();
    }
}
