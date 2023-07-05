package com.springMvcA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMvcA.model.Customer;
import com.springMvcA.service.CustomerService;

@Controller
public class HomeController {
	@Autowired
	private CustomerService cs;
	
	@RequestMapping(value="/reg")
	public String registerData(@ModelAttribute Customer customer) {
		System.out.println("Customer Data : "+customer);
		cs.registerData(customer);
		System.out.println("Customer added Successfully....");
		return "success";
		
	}
	
	@RequestMapping(value="/log")
	public String loginData(@RequestParam("user") String user,@RequestParam("pass") String pass,Model m) {
		System.out.println("Username : "+user);
		System.out.println("Password : "+pass);
		List<Customer> clist=cs.getAllCustomers(user, pass);
		
		if(!clist.isEmpty()) {
			m.addAttribute("clist", clist);
			return "detailes";
		}
		else {
			return "warning";
		}
		
	}
	
	
	

}
