package arraymove;
import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {

		int [] n = {1, 2, 5, 6, 8, 9};
		
		int n1 = n[0];
		int n2 = n[5];
		
		n[0]=n2;
		n[5]=n1;
					
		String s = Arrays.toString(n);
		
		System.out.println(s);
	}
}