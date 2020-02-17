class FindNumber{
	public static void main(String[] args){
		int num, i;
		int sum = 0;
		for(num = 1; num <= 10000; ++num){
			for(i = 1; i < num; ++i){
				if(num % i == 0){
					sum += i;
				}
			}
			if(sum == num)
				System.out.print(num + "\t");
			sum = 0;
			
		}
	}
}