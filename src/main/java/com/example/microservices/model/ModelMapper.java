package com.example.microservices.model;

import com.example.microservices.model.dto.PersonDTO;
import com.example.microservices.model.dto.PersonSendEvent;
import com.example.microservices.model.dto.personInterface;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ModelMapper<T extends personInterface,A extends personInterface> {
    @SneakyThrows
    public A map(personInterface person, Class<T> personClass){

        A personAnswer =  (A) Arrays.stream(personClass.getConstructors()).filter(
                constructor -> constructor.getParameterCount() == 0
        ).findAny().get().newInstance();
        personAnswer.setAge(person.getAge());
        personAnswer.setName(person.getName());
        personAnswer.setBarCode(person.getBarCode());
        return personAnswer;

    }
}
