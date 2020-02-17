import java.util.Scanner;
class MultiplyMatrix{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] c = new double[3][3];
		
		int t = 0;
		int k = 0;
		for(int x = 0; x < 9; ++x){
			a[t][k++] = sc.nextDouble();
			if((k) % 3 == 0){
				k = 0;
				++t;
			}
		}
		
		t = 0;
		k = 0;
		for(int x = 0; x < 9; ++x){
			b[t][k++] = sc.nextDouble();
			if((k) % 3 == 0){
				k = 0;
				++t;
			}
		}
		
		c = multiplyMatrix(a, b);
		
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				System.out.print(a[i][j] + " ");
			}
			
			if(i == 1)
				System.out.print(" *  ");
			else
				System.out.print("\t");
				
			for(int j = 0; j < 3; ++j){
				System.out.print(b[i][j] + " ");
			}
				
			if(i == 1)
				System.out.print(" =  ");
			else
				System.out.print("\t");
			
			for(int j = 0; j < 3; ++j){
				System.out.printf("%.1f ",c[i][j]);
			}
			System.out.println();
		}
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] result = new double[3][3];
		double temp = 0;
		
		for (int i = 0; i < 3; ++i)
			for (int k = 0; k < 3; ++k) {
				for (int j = 0; j < 3; ++j) {
					temp += a[i][j] * b[j][k];
				}
				result[i][k] = temp;
				temp = 0;
			}
		return result;
	}
}