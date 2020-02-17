class PrintPrime{
	public static void main(String[] args){
		final int number = 1000;
		int i, j;
		int count = 0;
		for(i = 2; i <= number; ++i){
			
			for(j = 2; j <= i; ++j){
				if(i % j == 0)
					break;
			}
			
			if(j == i){
				System.out.print(j + " ");
				++count;
			}
			if(count % 8 == 0)
				System.out.print("\n");
		}
	}
}