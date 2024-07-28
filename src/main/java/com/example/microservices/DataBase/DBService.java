package com.example.microservices.DataBase;

import com.example.microservices.model.dto.PersonDTO;
import com.example.microservices.model.entity.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DBService {
    private final PersonRepository dbService;

    public DBService(PersonRepository dbService) {
        this.dbService = dbService;
    }


    public void add(PersonDTO personDTO){
        dbService.save(new PersonEntity(personDTO.getName(),personDTO.getAge()));
    }
    public void remove(PersonDTO personDTO){
        dbService.delete(new PersonEntity(personDTO.getName(),personDTO.getAge()));
    }
    public List<PersonDTO> getAll(){
        List<PersonDTO> personDTOList = new ArrayList<>();
       dbService.findAll().forEach(personEntity -> {
            personDTOList.add(new PersonDTO(personEntity.getName(),personEntity.getAge(),personEntity.getId().toString()));
        });

        return personDTOList;

    }


}
