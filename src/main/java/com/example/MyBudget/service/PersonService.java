package com.example.MyBudget.service;

import com.example.MyBudget.domain.Person;
import java.util.List;

public interface PersonService {

    public List<Person> findAll();
    public Person findById(int theID);

    public List<Person> listAll(String keyword);
    public void save(Person thePerson);

}
