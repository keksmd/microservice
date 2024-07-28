package com.example.microservices.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Entity
@Table(name = "persons")
@NoArgsConstructor
public class PersonEntity {

    int age;
    String name;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public PersonEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
