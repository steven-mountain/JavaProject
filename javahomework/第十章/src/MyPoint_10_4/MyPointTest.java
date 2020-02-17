package MyPoint_10_4;

public class MyPointTest {
	public static void main(String[] args) {
		MyPoint mp1 = new MyPoint();
		MyPoint mp2 = new MyPoint(10, 30.5);
		System.out.println("the distance is " + mp1.distance(mp2));
	}
}
