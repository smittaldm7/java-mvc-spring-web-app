package com.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.dao.CustomerDao;
import com.spring.model.Customer;

@Controller
public class GreetingController {

	@GetMapping("/")
    public String greeting1(Model model) {
        model.addAttribute("name","Home");
        
       
        return "greeting";
    }
	
	@GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name","Greetings!");
        return "greeting";
    }

}
