import java.util.Scanner;
class SumOfEveryDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int sum = sumDigits(n);
		System.out.println(sum);
	}
	public static int sumDigits(long n){
		int sum = 0;
		while(n > 0){
			sum += (int)(n % 10);
			n /= 10;
		}
		return sum;
	}
}