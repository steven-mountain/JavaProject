import java.util.Scanner;
class FindMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int raw = sc.nextInt();
		int colum = sc.nextInt();
		double[][] num = new double[raw][colum];
		double max = 0;
		int maxRaw = 0;
		int maxColum = 0;
		
		
		for(int i = 0; i < raw; ++i){
			for(int j = 0; j < colum; ++j){
				num[i][j] = sc.nextDouble();
				if(i == 0 && j == 0)
					max = num[0][0];
				if(num[i][j] > max){
					max = num[i][j];
					maxRaw = i;
					maxColum = j;
				}
			}
		}
		
		System.out.println("The location of the largest element is at (" + maxRaw + " ," + maxColum + ") ");
	}
}