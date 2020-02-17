/*
	一英里等于1.609米
*/
class PrintTab{
	public static void main(String[] args){
		final double tfRate = 1.609;
		System.out.println("英里\t千米");
		for(int i = 1; i < 11; ++i){
			System.out.println(i + "\t" + tfRate * i);
		}
	}
	
}