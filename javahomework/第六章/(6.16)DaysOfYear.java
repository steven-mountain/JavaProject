class DaysOfYear{
	public static void main(String[] args){
		System.out.println("year\tdays");
		for(int i = 2000; i <= 2020; ++i){
				System.out.printf("%4d\t%d\n", i, numberOfDaysInAYear(i));
		}
	}
	public static int numberOfDaysInAYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
			return 366;
		return 365;
	}
}