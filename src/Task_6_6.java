
	import java.util.Scanner;

	public class Task_6_6 {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int number = scan.nextInt();
	System.out.println(String.format("%s",Integer.toBinaryString(number)));
	String s = Integer.toBinaryString(number);
		System.out.println(getm(s));
	}

	static int getm(String number){
	int counter = 0;
	for(int i=0; i<number.length(); i++) {
	    if(number.charAt(i) == '1' ) {
	        counter++;
	    } 
	}
	return counter;
	}
	}
