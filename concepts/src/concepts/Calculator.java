package concepts;

public class Calculator {
	
	private int num1;
	private int num2;
	Calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	
}	
class StudentCanculator2 {	
	public static void addition(Calculator c){
		int sum = c.getNum1()+ c.getNum2();
		System.out.println("Sum of the numbers is: " + sum);
	}
	public static void subtraction(Calculator c){
		int diff = c.getNum1() - c.getNum2();
		System.out.println("Sum of the numbers is: " + diff);
	}
	public static void multiplication(Calculator c){
		int mul = c.getNum1()*c.getNum2();
		System.out.println("Sum of the numbers is: " + mul);
	}
	public static void division(Calculator c){
		int div = c.getNum1()/c.getNum2();
		System.out.println("Sum of the numbers is: " + div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator(10,5);
		Calculator c2 = new Calculator(20,4);
		addition(c1);
		addition(c2);
		subtraction(c1);
		subtraction(c2);
		multiplication(c1);
		multiplication(c2);
		division(c1);
		division(c2);

	}

}
