class Transformation{
	public static void main(String[] args){
		double m = 20.0;
		System.out.println("Ó¢³ß\tÃ×\t\tÃ×\tÓ¢³ß");
		
		for(int i = 1; i <= 10; ++i){
			System.out.printf("%.1f\t%.3f\t\t%.1f\t%.3f\n",(double)i, footToMeter(i), m, meterToFoot(m));
			m += 5;
		}
	}
	
	public static double footToMeter(double foot){
		return 0.305 * foot;
	}
	
	public static double meterToFoot(double meter){
		return meter * 3.279;
	}
}