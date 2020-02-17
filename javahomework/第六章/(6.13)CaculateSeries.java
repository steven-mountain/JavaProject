class CaculateSeries{
	public static void main(String[] args){
		double up = 1;
		double low = 2;
		double result = 0;
		
		System.out.println("i \tm(i)");
		for(int i = 1; i <= 20; ++i){
			result += up / low;
			System.out.printf("%2d\t%2.4f\n", i, result);
			up = low;
			++low;
		}
	}
}