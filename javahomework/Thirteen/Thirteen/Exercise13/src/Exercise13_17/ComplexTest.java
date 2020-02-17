package Exercise13_17;

import java.util.Scanner;

public class ComplexTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first complex number: ");
		Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
		System.out.print("Enter the second complex number: ");
		Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());
		c1.add(c2);
		c1.substract(c2);
		c1.mutiply(c2);
		c1.divide(c2);
		c1.abs();
	}
}
