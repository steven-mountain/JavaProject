import java.util.Scanner;
class PrintDifferentNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		int x = 0;
		int count = 0;
		int i = 0;
		System.out.print("Enter the numbers: ");
		while(i < 10){
			x = sc.nextInt();
			if(i == 0)
				number[count++] = x;
			else{
				for(int j = 0; j <= count; ++j){
					if(x == number[j])
						break;
					else if(j == count){
						number[count++] = x;
						break;
					}
				}
			}
			++i;
		}
		
		System.out.println("The number of distinct number is : " + count);
		System.out.print("The distinct numbers are : ");
		for(int j = 0; j < count; ++j){
			System.out.print(number[j] + " ");
		}
		System.out.println();
	}
}