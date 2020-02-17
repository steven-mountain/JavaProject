import java.util.Scanner;
class RangeColum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[][] m = new double[3][3];
		double[][] c = new double[3][3];
		
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				m[i][j] = sc.nextDouble();
			}
		}
		c = sortRows(m);
		System.out.println("The row-sorted array is:");
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double [][] sortRows(double[][] m){
		double[][] temp = new double[3][3];
		for(int i = 0; i < 3; ++i){
			for(int j = 0; j < 3; ++j){
				temp[i][j] = m[i][j];
			}
		}
		int x = 0;
		double tem = 0;
		for(int i = 0; i < 3; ++i){
				if(temp[x][i] > temp[x + 1][i]){
					tem = temp[x][i];
					temp[x][i] = temp[x + 1][i];
					temp[x + 1][i] = tem;
				}
				if(temp[x][i] > temp[x + 2][i]){
					tem = temp[x][i];
					temp[x][i] = temp[x + 2][i];
					temp[x + 2][i] = tem;
				}
				if(temp[x + 1][i] > temp[x + 2][i]){
					tem = temp[x + 1][i];
					temp[x + 1][i] = temp[x + 2][i];
					temp[x + 2][i] = tem;
				}
		}
		return temp;
	}
}