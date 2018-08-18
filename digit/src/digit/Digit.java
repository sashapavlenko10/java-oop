package digit;
import java.util.Scanner;
class Digit{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a,b,c;;
	a = scan.nextInt();
	b = scan.nextInt();
	c = a + b;
	System.out.println(c);
	c = a - b;
	System.out.println(c);
	c = a * b;
	System.out.println(c);
	c = a / b;
	System.out.println(c);
}
}