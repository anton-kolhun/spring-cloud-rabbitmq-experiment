package com.experiment.rabbitmq.producer.service.dto;

import lombok.Data;

@Data
public class MessageDto {

    private String from;

    private String to;

    private String body;
}
