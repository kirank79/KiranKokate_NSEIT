package com.examples.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.orderservice.model.Order;
import com.examples.orderservice.repo.OrderRepo;
import com.examples.orderservice.model.Order;
import com.examples.orderservice.repo.OrderRepo;


@Service

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo repo;

	@Override
	public String insertOrder(Order order) {
		// TODO Auto-generated method stub
		repo.save(order);
		return "order Added";
	}
	
	@Override
	public List<Order> displayAllOrder() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteOrder(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "order Deleted";
	}
	
//	@Override
//	public List<Order> searchOrderByCid(String cid) {
//		// TODO Auto-generated method stub
//		return repo.searchOrderByCid(cid);
//	}

	public List<Order> searchOrderByPostId(int pid) {
		// TODO Auto-generated method stub
		return repo.searchOrderByCustomerId(pid);
	}

	@Override
	public List<Order> searchOrderByOid(String oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> searchOrderByCid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
