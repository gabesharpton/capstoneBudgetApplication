package com.example.MyBudget.controllers;

//import com.example.MyBudget.repository.BalanceRepository;
//import com.example.MyBudget.repository.BillsRepository;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeScreenController {

    @GetMapping("/homescreen")
    public String getHome() {return "homescreen";}

    @RequestMapping ("/about")
    public String getAbout(){
        return "about";
    }


}
