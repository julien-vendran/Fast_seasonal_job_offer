package com.polytech.offer.kafka;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaMsgListener {

    @KafkaListener(topics = "msg_topic", groupId="group_id")
    public void listenerMsg(@Payload String test){
        System.out.println(test);
    }
}
