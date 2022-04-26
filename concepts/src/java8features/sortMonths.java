package java8features;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("May","April","December","January","March");
//		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM");
//		LocalDate date = LocalDate.now();
//		System.out.println(date.getMonth());
		
	     Collections.sort(list,  new Comparator<String>() {
	         public int compare(String o1, String o2) {
	             try {
	                 SimpleDateFormat sdf = new SimpleDateFormat("MMM");
//	                 DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM");
	                 return sdf.parse(o1).compareTo(sdf.parse(o2));  //sdf.parse returns date - So, Compare Date with date
	             } catch (ParseException ex) {
	                 return o1.compareTo(o2);
	             }
	         }
	     });
	     
	     System.out.println(list);

	 }
		

	}


