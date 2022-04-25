package java8features;

import java.util.Arrays;
import java.util.List;

public class Ques2Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to print all names along with surname from different list.
		
		List<String> mylist1 = Arrays.asList("Rajesh","Irshad","Tom");
		List<String> mylist2 = Arrays.asList("Sharma","Malik","Gupta");
		for(String i : mylist2) {
			mylist1.stream().map(x -> x+" "+i).forEach(y -> System.out.println(y));
		}
		
		

		

	}

}
