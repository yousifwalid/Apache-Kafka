package com.example.MessagingTopic.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    //الـ groupId هو معرف مجموعة المستهلكين (Consumer Group). هو قيمة فريدة تُستخدم لتمييز مجموعة من مستهلكي Kafka الذين يستهلكون الرسائل من نفس الموضوع (Topic) بشكل مشترك.
    @KafkaListener(topics = "topic", groupId = "group_id")
    public void consume(String receivedMessage) {
        System.out.println("Received Message: " + receivedMessage);
    }
}
