import java.util.Scanner;
class DiagSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] num = new double[4][4];
		double Sum = 0.0;
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for(int j = 0; j < 4; ++j){
			for(int i = 0; i < 4; ++i){
				num[j][i] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i < 4; ++i){
			for(int j = 0; j < 4; ++j){
				if(i == j)
				Sum += num[j][i];
			}
			System.out.println("Sum of the elements in the major diagonal is " + thissum);
		}
	}
}