package com.example.microservices.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonSendEvent implements personInterface {
    int age;
    String name;
    String barCode;
}
