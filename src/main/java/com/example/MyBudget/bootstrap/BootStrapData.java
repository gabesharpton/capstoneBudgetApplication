package com.example.MyBudget.bootstrap;

import com.example.MyBudget.domain.Bills;
import com.example.MyBudget.domain.Budget;
import com.example.MyBudget.domain.Person;
import com.example.MyBudget.repository.BillsRepository;
import com.example.MyBudget.repository.BudgetRepository;
import com.example.MyBudget.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BudgetRepository budgetRepository;
    private final PersonRepository personRepository;
    private final BillsRepository billsRepository;

    public BootStrapData(BudgetRepository budgetRepository,PersonRepository personRepository, BillsRepository billsRepository){
        this.budgetRepository = budgetRepository;
        this.personRepository = personRepository;
        this.billsRepository = billsRepository;
    }

@Override
    public void run(String... args) throws Exception
    {
        Budget newBudget = new Budget(1,1,500,"04/2024");
        Person newPerson = new Person(1,500,200,"1000","Carl");
        Bills newBill = new Bills(1,20,"Fake Rent","04/21");
        Bills newerBill = new Bills(2,30,"Fake Car note","04/23");

        budgetRepository.save(newBudget);
        personRepository.save(newPerson);
        billsRepository.save(newBill);
        billsRepository.save(newerBill);

    }
}
