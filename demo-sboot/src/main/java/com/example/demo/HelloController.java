package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello from my spring boot application";
	}
	
	@RequestMapping("/tools")
	String tools() {
		return "Hello from tools page";
	}
	
	@RequestMapping("/students/{name}/{id}")
	String myStudents(@PathVariable String name, @PathVariable Long id) {
		return "Hello, My name is " +name + " and my id is " + id; 
	}
	
	@RequestMapping("/add/{num1}/{num2}")
	String addition(@PathVariable Double num1, @PathVariable Double num2) {
		Double add = num1+num2;
		return "Addition is " + add; 
	}
	@RequestMapping("/subtract/{num1}/{num2}")
	String subtraction(@PathVariable Double num1, @PathVariable Double num2) {
		Double sub = num1-num2;
		return "Subtraction is " + sub; 
	}
	@RequestMapping("/multiply/{num1}/{num2}")
	String multiply(@PathVariable Double num1, @PathVariable Double num2) {
		Double mul = num1*num2;
		return "Multiplication is " + mul; 
	}
	@RequestMapping("/divide/{num1}/{num2}")
	String divide(@PathVariable Double num1, @PathVariable Double num2) {
		Double div = num1/num2;
		return "Division is " + div; 
	}

}
