package com.kta.explorecrete.controller;

import com.kta.explorecrete.entity.Person;
import com.kta.explorecrete.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
    public String getPersonList(Model model){
        List<Person> persons = personService.findAll();
        model.addAttribute("persons",persons);
        return "fragments/persons";
    }
}
