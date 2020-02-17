package Fanction9_10;
import java.util.Scanner;

public class QuadraticEquationTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of a, b, c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		QuadraticEquation q = new QuadraticEquation(a, b, c);
		if(q.getDiscriminant() > 0) {
			System.out.println("The equation has two roots root1 is :" + q.getRoot1() + " root2 is:" + q.getRoot2());
		}
		else if(q.getDiscriminant() == 0) {
			System.out.println("The equation has ont  root is :" + q.getRoot1());
		}
		else {
			System.out.println("The equation has no roots");
		}
	}
}
