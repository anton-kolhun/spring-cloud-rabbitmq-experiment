package com.experiment.rabbitmq.producer.service;

import com.experiment.rabbitmq.producer.service.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private JmsSender jmsSender;

    public String sendMessage() {
        MessageDto messageDto = new MessageDto();
        messageDto.setFrom("Anton");
        messageDto.setTo("Olha");
        messageDto.setBody("see you after 7 pm");
        Message<MessageDto> message = MessageBuilder.withPayload(messageDto).build();
        jmsSender.sendMessage().send(message);
        return "message sent!";
    }
}
