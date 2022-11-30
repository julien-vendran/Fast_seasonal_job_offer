package com.polytech.offer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSenderMsg {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMsg(String test, String topicName) {
        kafkaTemplate.send(topicName, test);
        System.out.println("send offer to topic <worked");
    }
}
