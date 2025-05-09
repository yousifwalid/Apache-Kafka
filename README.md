# Apache-Kafka

This is a simple **Proof of Concept (PoC)** project that demonstrates how to integrate **Apache Kafka** with **Spring Boot** for producing and consuming messages.

The project provides a REST endpoint to send messages to a Kafka topic and a listener to consume them in real time.

Key Objectives:
-------------
- Show how to configure Kafka with Spring Boot
  
- Send messages to a Kafka topic using a REST controller
 
- Consume messages from the topic using @KafkaListener
 
- Measure message publishing latency

Endpoint:
--------
GET/ProducerMsg : Recieve message from producer and sending it to the topic.


