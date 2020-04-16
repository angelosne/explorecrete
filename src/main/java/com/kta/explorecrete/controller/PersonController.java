package com.kta.explorecrete.controller;

import com.kta.explorecrete.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api/person")
    public ResponseEntity getAllPersons() {
        return new ResponseEntity(personService.findAll(), HttpStatus.OK);
    }

}
