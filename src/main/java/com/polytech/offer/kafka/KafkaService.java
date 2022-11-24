package com.polytech.offer.kafka;

public interface KafkaService {

    void sendMessage(String message, String topicName);

}