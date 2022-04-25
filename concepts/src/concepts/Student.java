package concepts;

import java.util.Scanner;

public class Student {
	
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
	public void getGrade() {
		if(marks>=90&&marks<=100) {
			System.out.println("Grade of "+ name + " is A");
		}else if(marks>=80&&marks<90) {
			System.out.println("Grade of "+ name + " is B");
		}else if(marks>=70&&marks<80) {
			System.out.println("Grade of "+ name + " is C");
		}else {
			System.out.println(name + " is Fail");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Irshad", 96);
		Student s2 = new Student("Demo1", 72);
		Student s3 = new Student("Demo2", 84);
		Student s4 = new Student("Demo3", 44);
		s1.getGrade();
		s2.getGrade();
		s3.getGrade();
		s4.getGrade();
	}

}
