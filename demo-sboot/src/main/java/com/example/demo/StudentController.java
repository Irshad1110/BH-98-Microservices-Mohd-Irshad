package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StudentController {
	
	@RequestMapping("/student/{name}/{id}/{cmarks}/{pmarks}/{mmarks}")
	String myStudents(@PathVariable String name, @PathVariable int id, @PathVariable int cmarks, @PathVariable int pmarks, @PathVariable int mmarks) {
		Student s = new Student(id,name,pmarks,cmarks,mmarks);
		int total = s.getTotal();
		double avg = total/3;
		String grade ="";
		if(avg>=90 && avg<=100) {
			grade="A";
		}else if(avg >=80 &&avg<90){
			grade="B";
		}else if(avg >=70 &&avg<80){
			grade="C";
		}else if(avg<70){
			grade="F";
		}
		
		return "Hello, My name is " +name + " and my id is " + id + " and my grade is " + grade; 
	}
	
	

}
