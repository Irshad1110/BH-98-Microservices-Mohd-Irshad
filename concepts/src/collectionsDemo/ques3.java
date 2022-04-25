package collectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ques3 {


	public static void main(String[] args) {
		
		Map<String, String> myMap = new HashMap<String, String>();
		
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter number of records");
        int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			
			String name = s.next();
			
			String phone = s.next();
			
			myMap.put(name, phone);
		}
		System.out.println("Enter number of inputs");
		int numInput = s.nextInt();

		while (numInput-->0) {

			String inputName = s.next();

			if (myMap.containsKey(inputName)) {

				System.out.println(inputName + "=" + myMap.get(inputName));
			} else {

				System.out.println("Not found");
			}

		}

	}

}
