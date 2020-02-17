import java.util.Scanner;
class Nine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int getNum = sc.nextInt();
		int[][] a = new int[3][3];
		
		int t = 2;
		int k = 2;
		int i = 31;
		for(int x = 0; x < 9; ++x){
			a[t][k--] = getNum % 2;
			if(k < 0){
				k = 2;
				--t;
			}
			getNum /= 2;
		}
		
		
		for(int x = 0; x < 3; ++x){
			for(int y = 0; y < 3; ++y){
				if(a[x][y] == 1)
					System.out.print("T ");
				else
					System.out.print("H ");
			}
			System.out.println();
		}
	}
}