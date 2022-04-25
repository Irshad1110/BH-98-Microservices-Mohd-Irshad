package collectionsDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
	
	 private int rollno;
	 private String name;
     private int marks;
     
     public Students(int rollno, String name, int marks) {
 		super();
 		this.rollno = rollno;
 		this.name = name;
 		this.marks = marks;
 	}
		 
	 public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}


}
public class StudentsSortArrayList{
	public static void sortList(List<Students> arr) {
		Collections.sort(arr, new Comparator<Students>(){

			  public int compare(Students o1, Students o2)
			  {
			     return o1.getRollno() - o2.getRollno();
			  }
			});
//		Collections.sort(arr);
		
		
		for(int i = 0;i<3;i++) {
			System.out.println(arr.get(i).getRollno());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(122,"Irshad",82);
		Students s2 = new Students(222,"Demo1",64);
		Students s3 = new Students(32,"Demo2",96);

		List<Students> arr = new ArrayList<Students>();
		

		arr.add(s3);
		arr.add(s1);
		arr.add(s2);
		sortList(arr);
		

	}

}

