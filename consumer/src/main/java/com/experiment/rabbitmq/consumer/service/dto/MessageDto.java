package com.experiment.rabbitmq.consumer.service.dto;

import lombok.Data;

@Data
public class MessageDto {

    private String from;

    private String to;

    private String body;
}
