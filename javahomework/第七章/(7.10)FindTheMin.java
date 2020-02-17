import java.util.Scanner;
class FindTheMin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] arry = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < 10; ++i){
			arry[i] = sc.nextDouble();
		}
		int minIndex = indexOfSmallestElement(arry);
		System.out.println("The minimum number is: " + arry[minIndex] + ", and the min's index is + " minIndex);
	}
	
	public static int indexOfSmallestElement(double[] arry){
		double min = arry[0];
		int minIndex = 0;
		for(int i = 1; i < arry.length; ++i){
			if(arry[i] < min){
				min = arry[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}