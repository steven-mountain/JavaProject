package Location9_13;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
public class LocationTest {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter teh number of rows and columns in the array");
		int row = sc.nextInt();
		int column = sc.nextInt();
		double[][] a = new double[row][column];
		
		System.out.println("Enter the array");
		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < column; ++j) {
				a[i][j] = sc.nextDouble(); 
			}
		}
		
		Location l = new Location();
		Location lt = l.locateLargest(a);
		System.out.println("The location of the largest element is " + lt.maxValue + " at (" + lt.row +", " + lt.colum + ")");
	}
}
