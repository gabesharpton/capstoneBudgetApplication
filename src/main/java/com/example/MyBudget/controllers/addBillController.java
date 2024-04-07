package com.example.MyBudget.controllers;

import com.example.MyBudget.domain.Bills;
import com.example.MyBudget.repository.BillsRepository;
import com.example.MyBudget.service.BillService;
import com.example.MyBudget.service.BillServiceImpl;
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
public class addBillController {
    @Autowired
    private ApplicationContext context;
    private BillService billService;
    private BillsRepository billsRepository;
    private static Bills newBill;
    private Bills theNewBill;


    @GetMapping("/showFormAddBills")
    public String showFormAddBills(Model theModel){
        newBill = new Bills();
        theNewBill = newBill;
        theModel.addAttribute("bills", newBill);
        return "showFormAddBills";
    }
    @PostMapping("/showFormAddBills")
    public String submitForm( @ModelAttribute("bills") Bills bills, BindingResult bindingResult, Model theModel){
        theModel.addAttribute("bills", bills);
        BillService repo = context.getBean(BillServiceImpl.class);
        if(bills.getBillID() != 0){
            Bills myBill = repo.findById((int) bills.getBillID());
            BillService billService1 = context.getBean(BillServiceImpl.class);
        }
        else{
            bills.setBillID(0);
        }
        repo.save(bills);
        return "confirmationAddBill";
    }


    @GetMapping("/showBillFormForUpdate")
    public String showBillFormForUpdate(@RequestParam("billID") int theID, Model theModel){

        BillService repo = context.getBean(BillServiceImpl.class);
        Bills thisBill = repo.findById(theID);
        theModel.addAttribute("bills", thisBill);
        return "showFormAddBills";
    }
    @GetMapping("/deleteBill")
    public String deleteBill( @RequestParam("billID") int theID,  Model theModel){
        BillService repo = context.getBean(BillServiceImpl.class);
        repo.deleteById(theID);
        return "confirmDelete";
    }

}
