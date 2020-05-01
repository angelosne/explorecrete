package com.kta.explorecrete.service;

import com.kta.explorecrete.entity.Person;
import com.kta.explorecrete.entity.Tour;
import com.kta.explorecrete.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Person> findById(int id) {
        Optional<Person> person = personRepository.findById(id);
        return person;
    }
}
