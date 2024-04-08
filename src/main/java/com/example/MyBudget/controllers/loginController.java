package com.example.MyBudget.controllers;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String showLoginPage( Model theModel){
    theModel.addAttribute("user", new SecurityProperties.User());
    return "/login";
    }
}
