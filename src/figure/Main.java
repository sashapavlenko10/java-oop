package figure;

public class Main {
public static void main(String [] argv) {
	int a = 5; int b = 7; 
Circle circle = new Circle();
circle.squire(a, b);
Rectangle rectangle = new Rectangle();
rectangle.squire(a, b);
Triangle triangle = new Triangle();
triangle.squire(a, b);
}
}