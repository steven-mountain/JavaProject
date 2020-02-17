class CaculatePI{
	public static void main(String[] args){
		System.out.println("i   \t\tm(i)");
		System.out.println("--------------------------------------");
		for(int i = 1; i <= 901;){
			System.out.printf("%4d\t\t%.4f\n", i, m(i));
			i += 100;
		}
	}
	
	public static double m(int i){
		double low = 1;
		double sign = 1;
		double result = 0.0;
		while(low <= (2 * i - 1)){
			result += ((1 / low) * sign);
			low += 2.0;
			sign *= -1;
		}
		result *= 4;
		return result;
	}
}