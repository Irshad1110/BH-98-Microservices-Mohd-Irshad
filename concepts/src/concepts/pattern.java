package concepts;

import java.util.Scanner;

public class pattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=num-i;j>0;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
