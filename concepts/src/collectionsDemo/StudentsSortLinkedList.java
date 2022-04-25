package collectionsDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentsSortLinkedList{
	public static void sortList(List<Students> arr) {
		Collections.sort(arr, new Comparator<Students>(){

			  public int compare(Students o1, Students o2)
			  {
			     return o1.getRollno() - o2.getRollno();
			  }
			});

		for(int i = 0;i<3;i++) {
			System.out.println(arr.get(i).getRollno());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(122,"Irshad",82);
		Students s2 = new Students(222,"Demo1",64);
		Students s3 = new Students(32,"Demo2",96);

		List<Students> arr = new LinkedList<Students>();
		

		arr.add(s3);
		arr.add(s1);
		arr.add(s2);
		sortList(arr);
		

	}

}

