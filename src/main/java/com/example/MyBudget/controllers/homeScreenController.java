package com.example.MyBudget.controllers;


import com.example.MyBudget.domain.Bills;
import com.example.MyBudget.domain.Budget;
import com.example.MyBudget.domain.Person;
import com.example.MyBudget.service.BillService;
import com.example.MyBudget.service.BudgetService;
import com.example.MyBudget.service.PersonService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller
public class homeScreenController {
    private PersonService personService;
    private BillService billService;
    private BudgetService budgetService;

    public homeScreenController(PersonService personService, BillService billService, BudgetService budgetService){
        this.personService = personService;
        this.billService = billService;
        this.budgetService = budgetService;
    }



    @GetMapping("/homescreen")
    public String listBudgetAndBills(Model theModel, @Param("budgetkeyword") String budgetkeyword, @Param("billskeyword") String billskeyword){
        List<Budget> budgetList = budgetService.listAll(budgetkeyword);
        theModel.addAttribute("budget",budgetList);
        theModel.addAttribute("budgetkeyword",budgetkeyword);

        List<Bills> billsList=billService.listAll((billskeyword));
        theModel.addAttribute("bills",billsList);
        theModel.addAttribute("billskeyword",billskeyword);
        return "homescreen";
    }


    @RequestMapping ("/about")
        public String listPersons(Model theModel, @Param("personkeyword") String personkeyword){
            List<Person> personList = personService.listAll(personkeyword);
            theModel.addAttribute("person", personList);
            theModel.addAttribute("personkeyword", personkeyword);
        return "about";
    }

}
