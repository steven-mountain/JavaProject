import java.util.Scanner;
class BubleRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] arry = new double[10];
		for(int i = 0; i < 10; ++i){
			arry[i] = sc.nextDouble();
		}
		arry = bubleSort(arry);
		for(int i = 0; i < 10; ++i){
			System.out.print(arry[i] + " ");
		}
		System.out.println();
	}
	public static double[] bubleSort(double[] arry){
		double temp = 0;
		for(int i = 0; i < arry.length - 1; ++i){
			for(int j = 0; j < arry.length - i - 1; ++j){
				if(arry[j] > arry[j + 1]){
					temp = arry[j];
					arry[j] = arry[j + 1];
					arry[j + 1] = temp;	
				}
			}
		}
		return arry;
	}
}