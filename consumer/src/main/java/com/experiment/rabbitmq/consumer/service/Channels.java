/**
 * Copyright (C) Zoomdata, Inc. 2012-2018. All rights reserved.
 */
package com.experiment.rabbitmq.consumer.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Channels {

    String STATUS = "status";
    String SEND_MESSAGE = "sendMessage";

    @Output(STATUS)
    MessageChannel status();

    @Input(SEND_MESSAGE)
    SubscribableChannel writeData();

}
