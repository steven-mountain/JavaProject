import java.util.Scanner;
class Polygon{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n = sc.nextInt();
		System.out.println("Enter the side: ");
		double side = sc.nextDouble();
		double area = area(n, side);
		System.out.println("the area of the po;ygon is " + area);
		
	}
	public static double area(int n, double side){
		double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		return area;
	}
}