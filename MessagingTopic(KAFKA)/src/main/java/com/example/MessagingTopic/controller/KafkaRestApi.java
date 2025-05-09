package com.example.MessagingTopic.controller;

import com.example.MessagingTopic.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaRestApi {

    private final Producer producer;

    @GetMapping("/ProducerMsg")
    public void get(@RequestParam("message") String message) {
        producer.sendMessageToTopic(message);
    }
}

//الـ Broker في Kafka هو الخادم المسؤول عن تخزين الرسائل الواردة من المنتجين وتوزيعها للمستهلكين. يتعامل مع البيانات عبر موضوعات وأجزاء، ويضمن الأداء العالي والموثوقية من خلال التكرار والتوزيع بين عدة Brokers
