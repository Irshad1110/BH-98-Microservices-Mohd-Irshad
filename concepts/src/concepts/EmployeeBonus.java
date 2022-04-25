package concepts;

class Employee{
	private int id;
	private String name;
	private double salary;
	private String designation;
	
	public Employee(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}

public class EmployeeBonus {
	
	public static void calculateBonus(Employee e) {
		
		if(e.getDesignation().equalsIgnoreCase("Manager")) {
			double bonus = e.getSalary() + 0.3*e.getSalary();
			System.out.println("Bonus of " + e.getName() + " is: " + bonus);
		}else if(e.getDesignation().equalsIgnoreCase("Lead")) {
			double bonus = e.getSalary() + 0.25*e.getSalary();
			System.out.println("Bonus of " + e.getName() + " is: " + bonus);
		}else if(e.getDesignation().equalsIgnoreCase("Associate")) {
			double bonus = e.getSalary() + 0.2*e.getSalary();
			System.out.println("Bonus of " + e.getName() + " is: " + bonus);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Irshad", 21000, "Manager");
		Employee e2 = new Employee(1,"Vishal", 19000, "Lead");
		Employee e3 = new Employee(1,"Abhishek", 15000, "Associate");
		calculateBonus(e1);
		calculateBonus(e2);
		calculateBonus(e3);
		

	}

	

}
