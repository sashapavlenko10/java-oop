
import java.util.Scanner;
class Digit{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a,b,c;
	System.out.println("enter digit one: ");
	a = scan.nextInt();
	System.out.println("enter digit two: ");
	b = scan.nextInt();
	c = a + b;
	System.out.println("result addition: " + c);
	c = a - b;
	System.out.println("result subtraction:" + c);
	c = a * b;
	System.out.println("result multiplication: " + c);
	c = a / b;
	System.out.println("result division: " + c);
}
}