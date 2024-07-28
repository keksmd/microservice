package com.example.microservices.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEvent implements  personInterface {
    String name;
    int age;
    String barCode;

}
