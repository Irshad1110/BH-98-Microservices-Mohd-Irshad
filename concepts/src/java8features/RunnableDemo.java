package java8features;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = new Runnable() {
	         @Override
	         public void run() { // Without lambda
	            System.out.println("Runnable without lambda");
	         }
	      };
	      Runnable r2 = () -> {   // Using lambda
	         System.out.println("Runnable with Lambda Expression");
	      };
	      Thread t1 =new Thread(r1);
	      Thread t2 =new Thread(r2);
	      t1.start();
	      t2.start();
		
		

	}

}

