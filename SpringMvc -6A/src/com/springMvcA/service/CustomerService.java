package com.springMvcA.service;

import java.util.List;

import com.springMvcA.model.Customer;

public interface CustomerService {

	public void registerData(Customer customer);
	
	public List<Customer> getAllCustomers(String user,String pass);
}
