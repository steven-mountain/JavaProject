import java.util.Scanner;
class PrintPyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i, j, k, x;
		for(i = 1; i <= number; ++i){
			for(j = number - i; j >= 0; --j)
				System.out.print("  ");
			for(x = i; x > 1; --x)
				System.out.print(x + " ");
			for(k = 1; k <= i; ++k)
				System.out.print(k + " ");
			System.out.println();
		}
	}
}