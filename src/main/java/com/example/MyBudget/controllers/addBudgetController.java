package com.example.MyBudget.controllers;

import com.example.MyBudget.domain.Budget;
import com.example.MyBudget.repository.BudgetRepository;
import com.example.MyBudget.service.BillService;
import com.example.MyBudget.service.BillServiceImpl;
import com.example.MyBudget.service.BudgetService;
import com.example.MyBudget.service.BudgetServiceImpl;
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
public class addBudgetController {
    @Autowired
    private ApplicationContext context;
    private BudgetService budgetService;
    private BudgetRepository budgetsRepository;
    private static Budget newBudget;
    private Budget theNewBudget;

    @GetMapping("/showFormAddBudget")
    public String showFormAddBudgets(Model theModel){
        newBudget = new Budget();
        theNewBudget = newBudget;
        theModel.addAttribute("budget", newBudget);
        return "showFormAddBudget";
    }
    @PostMapping("/showFormAddBudget")
    public String submitForm(@ModelAttribute("budget") Budget budget, BindingResult bindingResult, Model theModel){
        theModel.addAttribute("budget", budget);
        BudgetService repo = context.getBean(BudgetServiceImpl.class);
        if(budget.getBudgetID() != 0){
            Budget myBudget = repo.findById((int) budget.getBudgetID());
            BudgetService budgetService1 = context.getBean(BudgetServiceImpl.class);
        }
        else{
            budget.setBudgetID(0);
        }
        repo.save(budget);
        return "confirmationAddBudget";
    }

    @GetMapping("/showBudgetFormForUpdate")
    public String showBudgetFormForUpdate(@RequestParam("budgetID") int theID, Model theModel){
        BudgetService repo = context.getBean(BudgetServiceImpl.class);
        Budget thisBudget = repo.findById(theID);
        theModel.addAttribute("budget", thisBudget);
        return "showFormAddBudget";
    }

    @GetMapping("/deleteBudget")
    public String deleteBudget( @RequestParam("budgetID") int theID,  Model theModel){
        BudgetService repo = context.getBean(BudgetServiceImpl.class);
        repo.deleteById(theID);
        return "confirmDelete";
    }
}
