package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollectorQues2Max {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		Department d1 = new Department(111,"ECE");
		Department d2 = new Department(222,"CS");
		Department d3 = new Department(333,"BIO");
		
		Student3 s1 = new Student3(101,"Sumit",d1,90,95,93);
		Student3 s2 = new Student3(102,"Rajesh",d1,87,95,93);
		Student3 s3 = new Student3(103,"Suraj",d2,66,95,78);
		Student3 s4 = new Student3(104,"Tom",d2,69,95,93);
		Student3 s5 = new Student3(105,"Shiva",d2,90,78,93);
		Student3 s6 = new Student3(106,"Jay",d3,90,95,93);
		Student3 s7 = new Student3(107,"Sagar",d3,83,67,93);
		
		List<Student3> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		
		Map<Department, List<Student3>> studentDeptWise = students.stream().collect(Collectors.groupingBy(Student3::getDept));

		
		//Ques2 - give student record who scored maximum marks in his department.

		for(List<Student3> s :studentDeptWise.values() ) {
			Optional<Student3> maxMarksStudent = s.stream().collect(Collectors.maxBy(Comparator.comparing(Student3::totalMarks)));
			System.out.println(maxMarksStudent);
		}
		
		
		
//		Comparator<Student3> byMarks = Comparator.comparing(Student3::getTotal);
//		 Map<Department, Optional<Student3>> studentWithMaxMarks
//		   = students.stream().collect(
//		     groupingBy(Student3::getDept,
//		                reducing(BinaryOperator.maxBy(byMarks))));


	}

}
