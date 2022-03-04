package com.examples.customerservice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.examples.customerservice.model.OrderDto;
import com.examples.customerservice.model.Customer;
import com.examples.customerservice.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo repo;
	
	@Autowired
	RestTemplate template;
	
	@Autowired 
	CustomerFeignProxy proxy;
	
	


	@Override
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		
		return "Customer added ";
	}

	@Override
	public List<Customer> displayAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		repo.deleteById(customerId);
		return "Customer deleted";
	}

/*	@Override
	public List<Customer> searchCustomerByCname(String cname) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByCname(cname);
	}

	@Override
	public List<Customer> searchCustomerByCaddress(String caddress) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByCaddress(caddress);
	}

	@Override
	public List<OrderDto> searchCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		List<OrderDto> order = template.getForObject("http://ORDER-SERVICE/order/cid/"+cid,List.class);
		//List<OrderDto> order = proxy.findOrderByCid(cid);
		return order;
	}*/

	@Override
	public List<OrderDto> searchOrderByPid(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> searchCustomerByCname(String cname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> searchCustomerByCaddress(String caddress) {
		// TODO Auto-generated method stub
		return null;
	}

}



