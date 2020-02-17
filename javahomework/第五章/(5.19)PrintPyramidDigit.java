import java.util.Scanner;
class PrintPyramidDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i, j, k, x;
		for(i = 0; i < number; ++i){
			for(j = number - i; j >= 0; --j)
				System.out.print("    ");
			for(k = 0; k < i; ++k)
				System.out.print((int)Math.pow(2, k) + "   ");
			for(x = i; x >= 0; --x)
				System.out.print((int)Math.pow(2, x) + "   ");
			System.out.println();
		}
	}
}