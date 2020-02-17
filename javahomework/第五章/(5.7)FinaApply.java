class FinaApply{
	public static void main(String[] args){
		//增长率
		final double rate = 1.05;
		double currentFair = 10000;
		double sum = 0.0;
	
		//计算10年后的学费
		for(int i = 0; i < 10; ++i){
			currentFair *= rate;
		}
		System.out.println("10年后的学费为：" + currentFair);
	
		//计算第11 - 15 年学费的总和
		for(int x = 0; x < 4; ++x){
			currentFair *= rate;
				sum += currentFair;
		}
		System.out.println("10年后的四年内的总学费为：" + sum);
	}
}