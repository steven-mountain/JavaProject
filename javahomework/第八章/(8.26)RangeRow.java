import java.util.Scanner;
class RangeRow{
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
				if(temp[i][x] > temp[i][x + 1]){
					tem = temp[i][x];
					temp[i][x] = temp[i][x + 1];
					temp[i][x + 1] = tem;
				}
				if(temp[i][x] > temp[i][x + 2]){
					tem = temp[i][x];
					temp[i][x] = temp[i][x + 2];
					temp[i][x + 2] = tem;
				}
				if(temp[i][x + 1] > temp[i][x + 2]){
					tem = temp[i][x + 1];
					temp[i][x + 1] = temp[i][x + 2];
					temp[i][x + 2] = tem;
				}
		}
		return temp;
	}
}