package com.experiment.rabbitmq.producer;

import com.experiment.rabbitmq.producer.service.JmsSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(JmsSender.class)
public class RabbitmqExperimentProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqExperimentProducerApplication.class, args);
    }
}
