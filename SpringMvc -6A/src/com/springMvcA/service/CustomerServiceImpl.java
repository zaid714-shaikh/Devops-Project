package com.springMvcA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMvcA.dao.CustomerDao;
import com.springMvcA.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao cd;
	
	@Override
	public void registerData(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(" Customer In Dao Lear");
		cd.registerData(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers(String user, String pass) {
		// TODO Auto-generated method stub
		return cd.getAllCustomers(user, pass);
	}

}
