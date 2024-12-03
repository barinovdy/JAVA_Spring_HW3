package ru.gb.sem3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PersonService {
    private List<Person> personList = new ArrayList<>();
    private AtomicInteger idCounter = new AtomicInteger();

    public Person addPerson(Person newPerson) {
        int id = idCounter.incrementAndGet();
        newPerson.setId((int)id);
        personList.add(newPerson);
        return newPerson;
    }

    public List<Person> getPerson() {
        return personList;
    }

}
