package com.examples.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.examples.orderservice.model.Order;
import com.examples.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/all")
	public List<Order> showAll(){
		return service.displayAllOrder();
	}
	
	@PostMapping("/add")
	public String addOrder(@RequestBody Order order) {
		return service.insertOrder(order);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deletecustomer(@PathVariable("cid") int cid) {
		return service.deleteOrder(cid);
	}
	/*
	 * @GetMapping("/commenter/{name}") public List<Comments>
	 * searchByCommenter(@PathVariable("name") String commenter) { return
	 * service.searchCommentsByCommenter(commenter); }
	 * 
	 * @GetMapping("/pid/{pid}") public List<Comments>
	 * searchByPid(@PathVariable("pid") int pid) { return
	 * service.searchCommentsByPostId(pid); }
	 * 
	 */
	

}
