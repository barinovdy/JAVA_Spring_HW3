package ru.gb.sem3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person newPerson) {
        return personService.addPerson(newPerson);
    }

    @GetMapping("/person")
    public List<Person> getPerson() {
        return personService.getPerson();
    }
}
