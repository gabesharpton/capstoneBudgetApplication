package com.example.MyBudget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    @Autowired
    private ApplicationContext context;
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String showLoginPage( Model theModel){
    theModel.addAttribute("user", new SecurityProperties.User());
    return "/login";
    }
}
