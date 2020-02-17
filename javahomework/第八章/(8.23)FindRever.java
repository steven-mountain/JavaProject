import java.util.Scanner;
class FindRever{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[][] num = new int[6][6];
	int row = 0;
	int colum = 0;
	int count = 0;
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 6; ++j){
				num[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 6; ++j){
				if(num[i][j] == 1)
					++count;
			}
			if(count % 2 != 0){
				row = i;
				break;
			}
			count = 0;
		}
	
	count = 0;
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 6; ++j){
				if(num[j][i] == 1)
					++count;
			}
			if(count % 2 != 0){
				colum = i;
				break;
			}
			count = 0;
		}
		
		System.out.println("The flipped cell is at (" + row + ", " + colum + ") ");
	}
}