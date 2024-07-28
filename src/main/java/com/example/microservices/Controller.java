package com.example.microservices;

import com.example.microservices.DataBase.DBService;
import com.example.microservices.model.dto.PersonDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/persons")
public class Controller {
    private final Producer producer;
    private final DBService dbService;

    public Controller(Producer producer,DBService dbService) {
        this.producer = producer;
        this.dbService = dbService;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/add")
    public void add(@RequestParam PersonDTO personDTO) {
        producer.sendPersonEvent(personDTO);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/remove")
    public void remove(@RequestParam PersonDTO personDTO) {
        producer.sendPersonEvent(personDTO);
    }
}
