package com.springMvcA.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springMvcA.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sf;
	@Override
	public void registerData(Customer customer) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		System.out.println("Customer ....");
		
	}
	@Override
	public List<Customer> getAllCustomers(String user, String pass) {
		// TODO Auto-generated method stub
		List<Customer> clist=new ArrayList<Customer>();
		Session session=sf.openSession();
		if(user.equals("admin") && pass.equals("admin@123")) {
			Query q=session.createQuery("from Customer");
			clist=q.getResultList();
			return clist;
		}else
		return clist;
	}

}
