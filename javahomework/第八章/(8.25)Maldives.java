import java.util.Scanner;
class Maldives{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[][] m = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				m[i][j] = sc.nextDouble();
			}
		}
		
		if(isMarkovMatrix(m))
			System.out.println("It is a Markov matrix");
		else
			System.out.println("It is not a Markov matrix");
	}
	
	public static boolean isMarkovMatrix(double[][] m){
		double sum = 0;
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				if(m[j][i] < 0)
					return false;
				else{
					sum += m[j][i];
				}
			}
			if(sum == 1.0)
				sum = 0;
			else
				return false;
		}
		return true;
	}
}