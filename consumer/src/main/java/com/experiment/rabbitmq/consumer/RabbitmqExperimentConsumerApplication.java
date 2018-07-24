package com.experiment.rabbitmq.consumer;

import com.experiment.rabbitmq.consumer.service.Channels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Channels.class)
public class RabbitmqExperimentConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqExperimentConsumerApplication.class, args);
    }
}
