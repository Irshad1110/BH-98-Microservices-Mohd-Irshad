package collectionsDemo;

import java.util.LinkedList;
import java.util.List;

public class FilterEvenLinkedList {
	
	public static void listFilter(List<Integer> mylist) {
		for(int i=0;i<mylist.size();i++) {
			if(mylist.get(i)%2!=0) {
				mylist.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist = new LinkedList<>();
		mylist.add(3);
		mylist.add(45);
		mylist.add(23);
		mylist.add(78);
		mylist.add(44);
		mylist.add(34);
		mylist.add(88);
		listFilter(mylist);
		System.out.println(mylist);
		
	}
}
