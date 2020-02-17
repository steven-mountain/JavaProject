package Circle2D_10_11;

public class Circle2DTest {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("c1's area: " + c1.getArea() + "c1'sperimeter: " + c1.getPerimeter());
		
		System.out.println("c1.contains(3,3)");
		System.out.println(c1.contains(3, 3));
		
		System.out.println("c1.contains(new Circle2D(4, 5, 10.5))");
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		
		System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3))");
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
