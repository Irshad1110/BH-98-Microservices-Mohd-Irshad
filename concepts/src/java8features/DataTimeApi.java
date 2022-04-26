package java8features;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DataTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate date = LocalDate.now();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the integer");
		int x= s.nextInt();
		if(x<=0) {
			x=x+8;
		}

		System.out.println(DayOfWeek.of(x));

	}

}
