import java.util.Scanner;
public class Str {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a,b,c;
        System.out.println("enter string 1: ");
        a = scan.nextLine();
        System.out.println("enter string 2: ");
        b = scan.nextLine();
        System.out.println("enter string 3: ");
        c = scan.nextLine();
        System.out.println("strings 1 + 3: " + a + c);
        System.out.println("strings 3 + 2 + 1: " + c + b + a);
        System.out.println("strings 1 + 2 + 3: " + a + b + c);
	}
}
