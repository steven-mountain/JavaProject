 class SumSeries{
	public static void main(String[] args){
		double up = 1;
		double low = 3;
		double sum = 0;
		while(low <= 99){
			sum += up / low;
			up += 2;
			low +=2;
		}
		System.out.println("最后结果为：" + sum);
	}
 }