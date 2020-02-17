class IsEven{
	public static void main(String[] args){
		int[][] num = new int[6][6];
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 6; ++j){
				num[i][j] = (int)(Math.random() * 2);
			}
		}
		
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 6; ++j){
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		if(isEven(num))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static boolean isEven(int[][] num){
		int count = 0;
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 6; ++j){
				if(num[i][j] == 1)
					++count;
			}
			if(count % 2 == 0)
				count = 0;
			else
				return false;
		}
		
		count = 0;
		for(int i = 0; i < 6; ++i){
			for(int j = 0; j < 6; ++j){
				if(num[j][i] == 1)
					++count;
			}
			if(count % 2 == 0)
				count = 0;
			else
				return false;
		}
		
		return true;
	}
}