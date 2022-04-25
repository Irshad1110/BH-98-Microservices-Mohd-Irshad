package concepts;

class Calculatorr {
	
	private int num1;
	private int num2;
	Calculatorr(int num1,int num2){
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

	public void addition(){
		int sum = num1+ num2;
		System.out.println("Sum of the numbers is: " + sum);
	}
	public void subtraction(){
		int diff = num1- num2;
		System.out.println("Sum of the numbers is: " + diff);
	}
	public void multiplication(){
		int mul = num1* num2;
		System.out.println("Sum of the numbers is: " + mul);
	}
	public void division(){
		int div = num1/ num2;
		System.out.println("Sum of the numbers is: " + div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorr c1 = new Calculatorr(10,5);
		Calculatorr c2 = new Calculatorr(20,4);
		c1.addition();
		c2.addition();
		c1.subtraction();
		c2.subtraction();
		c1.multiplication();
		c2.multiplication();
		c1.division();
		c2.division();

	}

}
