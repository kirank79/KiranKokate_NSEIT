package com.examples.nseit.springbootdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {
	
	@Autowired
	@Qualifier("c")
	Shape shape;
	
@GetMapping("/test1")
public String test3() {
return "response from test3";
}
@GetMapping("/test2")
public String test4() {
return "response from test4";
}

}