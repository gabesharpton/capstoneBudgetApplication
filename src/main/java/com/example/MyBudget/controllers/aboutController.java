package com.example.MyBudget.controllers;

import com.example.MyBudget.domain.Person;
import com.example.MyBudget.service.PersonService;
import com.example.MyBudget.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class aboutController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showPersonFormForUpdate")
    public String showPersonFormForUpdate(@RequestParam("personID") int theID, Model theModel){

        PersonService repo = context.getBean(PersonServiceImpl.class);
        Person thisPerson = repo.findById(theID);
        theModel.addAttribute("person", thisPerson);
        return "showPersonFormForUpdate";
    }

    @PostMapping("/showPersonFormForUpdate")
    public String submitForm(@ModelAttribute("person") Person person, BindingResult bindingResult, Model theModel){
        theModel.addAttribute("person", person);
        PersonService repo = context.getBean(PersonServiceImpl.class);
        if(person.getPersonID() != 0){
            Person person1 = repo.findById((int) person.getPersonID());
            PersonService billService1 = context.getBean(PersonServiceImpl.class);
        }
        else{
            person.setPersonID(0);
        }
        repo.save(person);
        return "confirmationAddPerson";
    }



}
