package com.examples.customerservice.service;


import java.util.List;

import com.examples.customerservice.model.OrderDto;
import com.examples.customerservice.model.Customer;

public interface CustomerService {

	 public String insertCustomer(Customer customer);
	 public List<Customer> displayAllCustomer();
	 public String deleteCustomer(int Cid);
	 public List<Customer> searchCustomerByCname(String cname);
	public List<Customer> searchCustomerByCaddress(String caddress);
	
	public List<OrderDto> searchOrderByPid(int pid);
	
}
