package concepts;

public class FilterEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,45,23,78,44,34,88};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
