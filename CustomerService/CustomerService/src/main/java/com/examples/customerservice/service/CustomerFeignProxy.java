package com.examples.customerservice.service;

	import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;

import com.examples.customerservice.model.OrderDto;
	


	@FeignClient(name="order-service", url="http://localhost:8082/")
	public interface CustomerFeignProxy {
		
		@GetMapping("order/pid/{pid}")
		public List<OrderDto> findOrderByCid(@PathVariable int cid);

	}



