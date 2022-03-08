package com.greatlearning.customerRelationshipManagement.service;

import java.util.List;

import com.greatlearning.customerRelationshipManagement.entity.Customer;




public interface CustomerService {
	
		
	public List<Customer>findByAll();
	
	

	public Customer  findById (int Id);

	public static void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id);


	}


