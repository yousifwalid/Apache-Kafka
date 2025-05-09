package com.example.MessagingTopic.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageToTopic(String message) {

        Long StartTime = System.currentTimeMillis();
        log.error("Start time consumes"+StartTime);
        kafkaTemplate.send("topic", message);

        Long EndTime = System.currentTimeMillis();
        log.error("End time is"+EndTime);
        System.out.println(EndTime - StartTime);
    }
}
