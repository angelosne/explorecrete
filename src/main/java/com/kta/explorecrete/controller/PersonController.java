package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.Person;
import com.kta.explorecrete.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api/persons")
    public ResponseEntity getAllPersons() {
        return new ResponseEntity(personService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/person")
    public String getPersonList(Model model) {
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
        return "persons";
    }

    @GetMapping("/person/{personId}")
    public String getPersonById(@PathVariable("personId") int personId, Model model) {
        Optional<Person> person = personService.findById(personId);
        model.addAttribute("person", person);
        return "person";
    }
}
