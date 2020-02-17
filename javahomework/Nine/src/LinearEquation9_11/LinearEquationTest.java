package LinearEquation9_11;
import java.util.Scanner;
public class LinearEquationTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a, b, c, d, e, f");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		LinearEquation l = new LinearEquation(a, b, c, d, e, f);
		if(l.isSolvable()) {
			System.out.println("The result is: x: " + l.getX() + " y:" + l.getY());
		}
		else
			System.out.println("The equation has no solution");
	}
}
