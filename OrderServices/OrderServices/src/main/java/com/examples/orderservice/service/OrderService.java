package com.examples.orderservice.service;

import java.util.List;

import com.examples.orderservice.model.Order;


public interface OrderService {
	
	public String insertOrder(Order order);
    public List<Order> displayAllOrder();
    public String deleteOrder(int cid);
    public List<Order> searchOrderByOid(String oid);
	public List<Order> searchOrderByCid(int cid);


}
