package com.alfie.kafka.message.consumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TestTopicListener {

    @KafkaListener(topics = "testTopic", groupId = "default-g1")
    public void listenForMessageß(String message) {
        System.out.println("Received Message %s at time %s".formatted(message, LocalDateTime.now()));
    }
}
