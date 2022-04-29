package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
	
private final StudentRepository studentRepository;
	
	StudentService(StudentRepository studentRepository){
		this.studentRepository=studentRepository;
	}

	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Optional<Student> getStudentById(@PathVariable Long id) {
		return studentRepository.findById(id);
	}

	public Student newStudent(Student student) {
		char grade;
		double total = (student.getPmarks()+student.getCmarks()+student.getMmarks())/3;
		if(total>=90 &&total<=100) {
			grade='A';
		}else if(total>=80 &&total<90) {
			grade='B';
		}else if(total>=70 &&total<80) {
			grade='C';
		}else {
			grade='F';
		}
		student.setGrade(grade);
		
		return studentRepository.save(student);
	}

	public void deleteStudentsById(Long id) {
		studentRepository.deleteById(id);
		
	}
	
	
	
	

}
