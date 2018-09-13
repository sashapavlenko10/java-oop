package src;

import java.util.Scanner;

public class Task_6_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter code: ");
		String x = input.next();
		System.out.println("your digit: " + Integer.parseInt(x,2));
		
	}

}
