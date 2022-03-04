package com.examples.customerservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.customerservice.model.Customer;
import com.examples.customerservice.model.OrderDto;
import com.examples.customerservice.service.CustomerService;





@RestController
@RequestMapping("/customer")

public class CustomerServiceController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> showAll(){
		return service.displayAllCustomer();
	}
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deletecustomer(@PathVariable("pid") int pid) {
		return service.deleteCustomer(pid);
	}
	
	/*
	 * @GetMapping("/author/{author}") public List<Customer>
	 * searchByAuthor(@PathVariable("author") String author) { return
	 * service.searchCustomerByAuthor(author); }
	 * 
	 * @GetMapping("/title/{title}") public List<Customer>
	 * searchByTitle(@PathVariable("title") String title) { return
	 * service.searchCustomerByTitle(title); }
	 */
	
	@GetMapping("/comments/{pid}")
	public List<OrderDto> findByPid(@PathVariable("pid")int pid){
		
		return service.searchOrderByPid(pid);
	}

}
