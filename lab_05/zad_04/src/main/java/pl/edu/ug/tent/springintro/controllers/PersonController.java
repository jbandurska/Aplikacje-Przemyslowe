package pl.edu.ug.tent.springintro.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pl.edu.ug.tent.springintro.domain.Person;
import pl.edu.ug.tent.springintro.service.PersonService;

@RestController
public class PersonController {
    final private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    ArrayList<Person> all() {

        return personService.all();
    }

    @GetMapping("/persons/{id}")
    Person one(@PathVariable String id) {

        return personService.one(id);
    }

    @PostMapping("/persons")
    Person newPerson(@RequestBody Person newPerson) {

        return personService.newPerson(newPerson);
    }

    @PutMapping("/persons/{id}")
    Person replacePerson(@RequestBody Person newPerson, @PathVariable String id) {

        return personService.replacePerson(newPerson, id);
    }

    @DeleteMapping("/persons/{id}")
    void deletePerson(@PathVariable String id) {

        personService.deletePerson(id);
    }
}
