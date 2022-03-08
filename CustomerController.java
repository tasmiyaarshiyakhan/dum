package com.greatlearning.customerRelationshipManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.customerRelationshipManagement.entity.Customer;
import com.greatlearning.customerRelationshipManagement.service.CustomerService;



@Controller
@RequestMapping("/customer")

public class CustomerController {
	
	@Autowired
    private CustomerService customerService;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> customer = customerService.findByAll();
		
		model.addAttribute("Customer", customer);
		
		return "list-customers";
		
}
	
	@PostMapping("/save")
	public String saveCustomer(@RequestParam("id") int id,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("Email") String Email) {
		
		
		Customer customer = null;
		if(id!=0) {
			
			customer = customerService.findById(id);
			customer.setFirstName(firstName);
			customer.setFirstName(lastName);
			customer.setFirstName(Email);
			
		}
		else {
			customer= new Customer( firstName, lastName, Email);
		}

		CustomerService.save(customer);
		
		 return"redirect:/customer/list";
	}

	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id){
		

		customerService.deleteById(id);
		
		 return"redirect:/customer/list";
		
		
		
	}
	
	

	@RequestMapping("/show formForAdd")
	
	public String deletecustomers(Model model) {
		
		Customer customer = new Customer();
		
		model.addAttribute("Customer", customer);
		
		return "Customer-form";
		
		
	}

	@RequestMapping("/showFormForUpdate")
	public String deleteCustomer(@RequestParam("id") int id, Model model) {
		
        Customer customer = customerService.findById(id);
		
		model.addAttribute("Customer", customer);
		
		return "Customer-form";
		
		
	}

}







