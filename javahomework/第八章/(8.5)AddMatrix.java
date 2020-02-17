import java.util.Scanner;
class AddMatrix{
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
		
		c = addMatrix(a, b);
		
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				System.out.print(a[i][j] + " ");
			}
			
			if(i == 1)
				System.out.print(" +  ");
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
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		for(int i = 0; i < a.length; ++i){
			for(int j = 0; j < a[0].length; ++j){
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}