package com.experiment.rabbitmq.consumer.service;

import com.experiment.rabbitmq.consumer.service.dto.MessageDto;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class SendMessageHandler {

    @StreamListener("sendMessage")
    @Output("status")
    public String handle(Message<MessageDto> message) {
        System.out.println(message);
        return "send_to_status_channel";
    }
}
