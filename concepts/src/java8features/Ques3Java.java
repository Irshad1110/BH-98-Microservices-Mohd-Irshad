package java8features;

import java.util.Arrays;
import java.util.List;

public class Ques3Java {

	public static void main(String[] args) {

		List<String> mylist1 = Arrays.asList("Rajesh", "Irshad", "Tom", "Rahul");
		for (String str : mylist1) {
			str.chars().filter(x -> "AEIOUaeiou".indexOf(x) != -1).forEach(y -> System.out.println((char) y));
		}

	}

}
