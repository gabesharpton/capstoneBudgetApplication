package com.example.MyBudget.service;

import com.example.MyBudget.domain.Bills;
import com.example.MyBudget.domain.Person;
import com.example.MyBudget.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepository personRepository;
//    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) { this.personRepository = personRepository;}
    public List<Person> findAll() { return (List<Person>) personRepository.findAll();}

    @Override
    public Person findById(int theID) {

        Long theIdl=(long)theID;
        Optional<Person> result = personRepository.findById(theIdl);

        Person thePerson = null;

        if (result.isPresent()) {
            thePerson = result.get();
        }
        else {
            // we didn't find the product id
            throw new RuntimeException("Did not find bill id - " + theID);
        }

        return thePerson;
    }

    @Override
    public List<Person> listAll(String keyword) {
        if(keyword != null){
            return personRepository.search(keyword);
        }
        return (List<Person>) personRepository.findAll();
    }
    @Override
    public void save(Person thePerson) {
        personRepository.save(thePerson);
    }
}
