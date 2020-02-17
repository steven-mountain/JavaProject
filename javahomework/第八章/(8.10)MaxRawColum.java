import java.util.Scanner;
class MaxRawColum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[4][4];
		int largeR = 0;
		int largeRIndex = 0;
		int largeCIndex = 0;
		int largeC = 0;
		int count = 0;
		for(int i = 0; i < 4; ++i){
			for(int j = 0; j < 4; ++j){
				num[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 4; ++i){
			count = 0;
			for(int j = 0; j < 4; ++j){
				if(num[i][j] == 1)
					++count;
			}
			if(count > largeR){
				largeR = count;
				largeRIndex = i;
			}
		}
		
		for(int i = 0; i < 4; ++i){
			count = 0;
			for(int j = 0; j < 4; ++j){
				if(num[j][i] == 1)
					++count;
			}
			if(count > largeC){
				largeC = count;
				largeCIndex = i;
			}
		}
		System.out.println("The largest row index: " + largeRIndex);
		System.out.println("The largest column index: " + largeCIndex);
	}
}