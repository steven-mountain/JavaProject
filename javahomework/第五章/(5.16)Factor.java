import java.util.Scanner;
class Factor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i = 2;
		while(i <= number){
			if(number % i == 0){
				System.out.print(i + "\t");
				number /= i;
				i = 2;
			}
			else
				++i;
		}
	}
}