package com.examples.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan("com.examples.customerservice")
@EnableFeignClients("com.examples.customerservice")
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	@Bean 
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}


/*
@SpringBootApplication
@ComponentScan("com.examples.postservice")
@EnableFeignClients("com.examples.postservice")
public class PostserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostserviceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
*/