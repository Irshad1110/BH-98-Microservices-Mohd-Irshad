package collectionsDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of inputs");
        int num = s.nextInt();
        ArrayList<ArrayList> list1 = new ArrayList<ArrayList>();
        for(int i = 0;i<num;i++){
            int n  = s.nextInt();
            ArrayList<Integer> list2 =  new ArrayList<Integer>();
            for(int j=0;j<n;j++){
            	int currnum = s.nextInt();
                list2.add(currnum);
            }
            list1.add(list2);

        }
        int numQuery = s.nextInt();
        for(int i=0;i<numQuery;i++){
            int x = s.nextInt()-1;
            int y = s.nextInt()-1;

            if(x<list1.size() && y<list1.get(x).size()){
                System.out.println(list1.get(x).get(y));
            }else{
                    System.out.println("ERROR!");
                }
        }
    }

}
