import java.util.Scanner;
class FindMin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < 10; ++i){
			array[i] = sc.nextDouble();
		}
		
		double min = min(array);
		System.out.println("The minimum number is: " + min);
	}
	public static double min(double[] array){
		double min = array[0];
		for(int i = 1; i < array.length; ++i){
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
}