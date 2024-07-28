package com.example.microservices.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
public class PersonDTO implements personInterface {

@JsonProperty("name")
    String name;
    @JsonProperty("age")
    int age;
    String barCode;

}
