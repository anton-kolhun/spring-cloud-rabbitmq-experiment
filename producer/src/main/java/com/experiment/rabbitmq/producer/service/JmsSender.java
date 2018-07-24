package com.experiment.rabbitmq.producer.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface JmsSender {

    String SEND_MESSAGE = "sendMessage";

    @Output(SEND_MESSAGE)
    MessageChannel sendMessage();
}
