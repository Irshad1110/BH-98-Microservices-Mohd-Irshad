package collectionsDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Customer{
	private int id;
	private String name;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

class CreditCard implements Comparable {
	
	private int cardno;
	private int expiry;
	public CreditCard(int cardno, int expiry) {
		super();
		this.cardno = cardno;
		this.expiry = expiry;
	}
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public int getExpiry() {
		return expiry;
	}
	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
	@Override
	public String toString() {
		return "CreditCard [cardno=" + cardno + ", expiry=" + expiry + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardno;
		result = prime * result + expiry;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (cardno != other.cardno)
			return false;
		if (expiry != other.expiry)
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.expiry - ((CreditCard) o).getExpiry();
	}
	
	
	
}

public class HashmapQues {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		WAP to create credit card application associated with customer 
//		object, sort based on credit card expiry date.
		
		
		Map<CreditCard,Customer> myMap = new LinkedHashMap<>();
		Customer c1 = new Customer(101,"Irshad");
		Customer c2 = new Customer(102,"Rachit");
		Customer c3 = new Customer(103,"Vivek");
		Customer c4 = new Customer(104,"Vaibhav");
		Customer c5 = new Customer(105,"Raghav");

		CreditCard cr1 = new CreditCard(1111,2024);
		CreditCard cr2 = new CreditCard(2222,2023);
		CreditCard cr3 = new CreditCard(3333,2026);
		CreditCard cr4 = new CreditCard(4444,2025);
		CreditCard cr5 = new CreditCard(1111,2022);
		
		myMap.put(cr1,c1);
		myMap.put(cr2,c2);
		myMap.put(cr3,c3);
		myMap.put(cr4,c4);
		myMap.put(cr5,c5);
		
		System.out.println(myMap);
		
		Map<Customer,CreditCard> ans = sortMap(myMap);
		System.out.println(ans);
		

	}

	private static Map sortMap(Map<CreditCard,Customer> myMap) {
		// TODO Auto-generated method stub
		Map<CreditCard,Customer> myMap2 = new LinkedHashMap<>();
		Set<CreditCard> set = new LinkedHashSet(myMap.keySet());
		List<CreditCard> list = new ArrayList<>();
		
        for (CreditCard t : set)
            list.add(t);
		Collections.sort(list);
		List<Customer> list2 = new ArrayList<>();
		
		 for(int i=0;i<list.size();i++) {
			 list2.add(myMap.get(list.get(i)));
		 }
		
		
        for(int i=0;i<list.size();i++){
        	myMap2.put(list.get(i), list2.get(i));
        }
        return myMap2;
		
	}

}
