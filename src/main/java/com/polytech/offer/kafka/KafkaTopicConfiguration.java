package com.polytech.offer.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic testTopic(){
        return TopicBuilder.name("msg_topic")
                .partitions(6)
                .build();
    }
}
