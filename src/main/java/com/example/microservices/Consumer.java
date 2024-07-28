package com.example.microservices;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class Consumer {
    @Value("${topic.send-order}")

    @KafkaListener(topics =  "topic",groupId = "32")
    public void listen(String message){
        log.info(message);
    }
}
