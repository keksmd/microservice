package com.example.microservices;

import com.example.microservices.model.dto.PersonSendEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessagingService {

    @Value("${topic.send-order}")
    private String sendClientTopic;

    private final KafkaTemplate<String , Object> kafkaTemplate;

    public void sendPerson(PersonSendEvent personSendEvent) {
       kafkaTemplate.send(sendClientTopic, personSendEvent.getBarCode(), personSendEvent);
    }

}