package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.dao.CustomerDao;
import com.spring.model.Customer;

@Controller
public class CustomerController {

	@GetMapping("/c")
    public String customerstuff(Model model) {
		
		CustomerDao customerDAO = new CustomerDao();
		
		Customer customer = new Customer("loftus-cheek",28);
		customerDAO.insert(customer);
		
		
		Customer customer1 = customerDAO.findByCustomerId(1);
		model.addAttribute(customer1);
		return "customer";
    }
}
