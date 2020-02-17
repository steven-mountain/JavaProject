class PrintPrimerYear{
	public static void main(String[] args){
		int count = 0;
		for(int i = 101; i <= 2100; ++i){
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
				System.out.print(i + " ");
				++count;
			}
		}
		System.out.println("\n一共有：" + count + "个闰年");
	}
}