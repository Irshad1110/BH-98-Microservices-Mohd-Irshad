package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
	
	
private final StudentRepository studentRepository;
	
	StudentController(StudentRepository studentRepository){
		this.studentRepository=studentRepository;
	}

	@GetMapping("/students")
	List<Student> getAll(){
		return studentRepository.findAll();
	}
	
//	@RequestMapping("/student/{name}/{id}/{cmarks}/{pmarks}/{mmarks}")
//	String myStudents(@PathVariable String name, @PathVariable int id, @PathVariable int cmarks, @PathVariable int pmarks, @PathVariable int mmarks) {
//		Student s = new Student(id,name,pmarks,cmarks,mmarks);
//		String grade = s.getGrade();
//		return "Hello, My name is " +name + " and my id is " + id + " and my grade is " + grade; 
//	}
	
	

}
