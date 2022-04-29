package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
	
	
private final StudentService studentService;
	
	StudentController(StudentService studentService){
		this.studentService=studentService;
	}

	@GetMapping("/students")
	List<Student> getAll(){
		return studentService.getAll();
	}
	
	@GetMapping("/students/{id}")
	Optional<Student> getStudentById(@PathVariable Long id){
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/students")
	Student newStudent(@RequestBody Student student){
		return studentService.newStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	void deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentsById(id);
	}

	
	

}
