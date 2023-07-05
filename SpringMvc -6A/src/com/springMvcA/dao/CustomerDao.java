package com.springMvcA.dao;

import java.util.List;

import com.springMvcA.model.Customer;

public interface CustomerDao {

	public void registerData(Customer customer);
	
	public List<Customer> getAllCustomers(String user,String pass);
}
