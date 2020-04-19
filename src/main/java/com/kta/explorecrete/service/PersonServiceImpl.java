package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.Person;
import com.kta.explorecrete.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public List<Person> findAll() {
        return personRepository.findAll();

    }
}
