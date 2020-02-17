class RangeDouble{
	public static void main(String[] args){
		int[][] num = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
		sort(num);
		for(int i = 0; i < num.length; ++i){
			for(int j = 0; j < num[0].length; ++j){
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void sort(int[][] num){
		for(int i = 0; i < num.length - 1; ++i){
			for(int j = 0; j < num.length - i - 1; ++j){
				if(num[j][0] > num[j + 1][0]){
					num[j][0] = num[j][0] ^ num[j + 1][0];
					num[j + 1][0] = num[j + 1][0] ^ num[j][0];
					num[j][0] = num[j][0] ^ num[j + 1][0];
					
					num[j][1] = num[j][1] ^ num[j + 1][1];
					num[j + 1][1] = num[j + 1][1] ^ num[j][1];
					num[j][1] = num[j][1] ^ num[j + 1][1];
				}
			}
		}
		
		int[] count = new int[10];
		for(int i = 0; i < num.length; ++i){
			++count[num[i][0]];
			
		}
		
		int n = 0;
		for(int i = 0; i < 10; ++i){
			if(count[i] != 0){
				for(int j = 0; j < count[i] - 1; ++j){
					for(int x = n; x < count[i] - j - 1 + n; ++x){
						if(num[x][1] > num[x + 1][1]){
							num[x][1] = num[x][1] ^ num[x + 1][1];
							num[x + 1][1] = num[x + 1][1] ^ num[x][1];
							num[x][1] = num[x][1] ^ num[x + 1][1];
						}
					}
				}
				n += count[i];
			
			}
		}
	}
}