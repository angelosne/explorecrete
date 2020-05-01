package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.Person;

import java.util.List;
import java.util.Optional;


public interface PersonService {
    List<Person> findAll();
    Optional<Person> findById(int id);
}
