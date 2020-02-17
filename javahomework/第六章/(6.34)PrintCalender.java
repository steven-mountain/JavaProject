import java.util.Scanner;
class PrintCalender{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full year (e.g., 2012): ");
		int year = sc.nextInt();
		System.out.println("Enter month as a number between 1 and 12:");
		int month = sc.nextInt();
		
		printMonth(year, month);
		
	}
	
	public static void printMonth(int year, int month){
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	
	public static void printMonthTitle(int year, int month){
		System.out.println("       " + getMonthName(month) + "  " + year);
		System.out.println("------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static String getMonthName(int month){
		String monthName = "";
		switch (month){
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "Mrch"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December"; break;
		}
		return monthName;
	}
	
	public static void printMonthBody(int year, int month){
		int startDay = getStartDay(year, month);
		int numberOfDayInMonth = getNumberOfDayInMonth(year, month);
		int i = 0;
		for(i = 0; i < startDay; ++i)
			System.out.print("    ");
		for(i = 1; i <= numberOfDayInMonth; ++i){
			System.out.printf("%4d", i);
			if((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	public static int getStartDay(int year, int month){
		//选择月份
		switch(month){
			case 1:
				month = 13;
				--year;
				break;
			case 2:
				month = 14;
				--year;
			break;
		}
		//求出世纪数j和该世纪的第几年k
		int j = year / 100;
		int k = year % 100;
		
		//计算是星期几
		int h = (1 + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		return h  - 1;
	}
	
	public static int getNumberOfDayInMonth(int year, int month){
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if(month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if(month == 2) return isLeapYear(year) ? 29 : 28;
		return 0;
	}
	
	public static boolean isLeapYear(int year){
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}