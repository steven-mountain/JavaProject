import java.util.Scanner;
class GetColoumSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] num = new double[3][4];
		double thisSum = 0.0;
		for(int j = 0; j < 3; ++j){
			for(int i = 0; i < 4; ++i){
				num[j][i] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i < 4; ++i){
			thissum = 0;
			for(int j = 0; j < 3; ++j){
				thisSum += num[j][i];
			}
			System.out.println("Sum of the elements at coloum " + i + " is " + thissum);
		}
	}
}