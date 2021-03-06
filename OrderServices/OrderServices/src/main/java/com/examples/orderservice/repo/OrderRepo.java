package com.examples.orderservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examples.orderservice.model.Order;

@Repository
@Transactional


public interface OrderRepo extends JpaRepository<Order,Integer> {


	@Query("select o from Order o where o.oid=?1")
	public List<Order> searchOrderByOid(String order);
	
	@Query("select o from order o where o.pid=?1")
	public List<Order> searchOrderByCustomerId(int pid);

	
}
