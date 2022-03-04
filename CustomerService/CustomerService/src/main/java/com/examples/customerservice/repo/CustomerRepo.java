package com.examples.customerservice.repo;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examples.customerservice.model.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	
	@Query("select p from Customer p where p.cname=?1")
	public List<Customer> searchCustomerBycname(String cname);
	
	@Query("select p from Customer p where p.Caddress=?1")
	public List<Customer> searchCustomerBycaddress(String caddress);

}
