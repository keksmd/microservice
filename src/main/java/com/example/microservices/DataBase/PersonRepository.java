package com.example.microservices.DataBase;

import com.example.microservices.model.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
