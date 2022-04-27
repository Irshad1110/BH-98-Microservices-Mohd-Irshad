package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StudentController {
	
	@RequestMapping("/student/{name}/{id}/{cmarks}/{pmarks}/{mmarks}")
	String myStudents(@PathVariable String name, @PathVariable int id, @PathVariable int cmarks, @PathVariable int pmarks, @PathVariable int mmarks) {
		Student s = new Student(id,name,pmarks,cmarks,mmarks);
		String grade = s.getGrade();
		return "Hello, My name is " +name + " and my id is " + id + " and my grade is " + grade; 
	}
	
	

}
