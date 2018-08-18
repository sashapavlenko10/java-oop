package string;

import java.util.Scanner;
public class Stroka {
	 public static void main(String[] args) {
		 String a,b,c;
	Scanner scan = new Scanner(System.in);
	System.out.print("enter string a : ");
	 a = scan.nextLine();
	 System.out.print("enter string b : ");
	 b = scan.nextLine();
	 System.out.print("enter string  c : ");
	 c = scan.nextLine();
	System.out.println ("string : " + a + c);
	System.out.println ("string : " + c + b + a);
	System.out.println ("string : " + a + b + c);
}
}