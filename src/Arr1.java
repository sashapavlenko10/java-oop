import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {
	int [] arr = {1, 2, 5, 6, 8, 9};
		
		int arr1 = arr[0];
		int arr2 = arr[5];
		
		arr[0]=arr2;
		arr[5]=arr1;
					
		String s = Arrays.toString(arr);
		
		System.out.println(s);
	}

}
