package com.example.microservices;

import com.example.microservices.model.ModelMapper;
import com.example.microservices.model.dto.PersonDTO;
import com.example.microservices.model.dto.PersonSendEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {

    private final KafkaMessagingService kafkaMessagingService;
    private final ModelMapper modelMapper;


    public PersonDTO sendPersonEvent(PersonDTO personDTO) {
        kafkaMessagingService.sendPerson((PersonSendEvent) modelMapper.map(personDTO,PersonDTO.class));
        log.info("Send person from producer {}", personDTO);
        return personDTO;
    }
}