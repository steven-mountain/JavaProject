import java.util.Scanner;
class Count{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int positive = 0;//记录正数的个数；
		int negative = 0;//记录负数的个数；
		int num;//输入的数
		double sum = 0;//和
		
		//提示输入
		System.out.print("Enter an interger, the input ends if it is 0: ");
		num = sc.nextInt();
		while(num != 0){
			sum += num;
			if(num > 0)
				++positive;
			else
				++negative;
			num = sc.nextInt();
		}
		//求出平均值
		double averge = sum / (positive + negative);
		//display the result
		System.out.println("The number of positive is " + positive);
		System.out.println("The number of negative is " + negative);
		System.out.println("The total is " + (double)(negative + positive + 1));
		System.out.println("The average is " + averge);
	}
	
}