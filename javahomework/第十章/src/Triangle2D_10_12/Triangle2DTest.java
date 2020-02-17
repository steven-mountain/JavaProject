package Triangle2D_10_12;

import MyPoint_10_4.MyPoint;

public class Triangle2DTest {
	public static void main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.println("Area: " + t1.getArea() + " perimeter:" + t1.getPerimeter());
		
		System.out.println("t1.contains(3.3)");
		System.out.println(t1.contains(new MyPoint(3, 3)));
		
		System.out.println("t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4)))");
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		
		System.out.println("t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5)))");
		System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
		
	}
}
