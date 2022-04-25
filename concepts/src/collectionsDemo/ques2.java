package collectionsDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ques2 {

public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int num = s.nextInt();
        int[] arr = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < num;i++){
        	list.add(s.nextInt());
        }
        int numQuery = s.nextInt();

        for(int i = 0;i < numQuery;i++){
            String queryType = s.next();
            if(queryType.equalsIgnoreCase("Insert")){
                arr[0]= s.nextInt();
                arr[1] = s.nextInt();
                list.add(arr[0],arr[1]);
            }else{
                int removeIndex = s.nextInt();
                list.remove(removeIndex);
            }  
        }
        for(Integer x : list){
            System.out.print(x+" ");
        }
    }

}
