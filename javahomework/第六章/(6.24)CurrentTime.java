import java.util.Scanner;
class CurrentTime{
	public static void main(String[] args){
		
		//获取1970年1月1日午夜到现在的毫秒数
		long totalMilliseconds = System.currentTimeMillis();
		long differDays = totalMilliseconds / (1000 * 60 * 60 * 24);
		int year = 1970;
		while(differDays >= 365){
			if(isLeapYear(year + 1)){
				differDays -= 366;
				++year;
			}
			else{
				differDays -=365;
				++year;
			}
		}
		int month = 0;
		int i = 1;
		while(differDays > 28){
			switch(i){
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					differDays -= 31;
					++month;
					break;
				case 4: case 6: case 9: case 11:
					differDays -= 30;
					++month;
					break;
				case 2:
					if(isLeapYear(year)){
						differDays -= 29;
						++month;
						break;
					}else{
						differDays -= 28;
						++month;
						break;
					}
			}
		}
		++month;
		printMonth(year, month);
		
		//将总毫秒数totalMilliseconds 除以1000得到总秒数totalSeconds
		long totalSeconds = totalMilliseconds / 1000;
		
		//通过totalSeconds % 60得到当前的秒数
		long currentSecond = totalMilliseconds % 60;
	
		
		//通过将totalSeconds 除以60得到总的分钟数
		long totalMinutes = totalSeconds / 60;
		
		//通过totalMinutes % 60 得到当前分钟数
		long currentMinute = totalMinutes % 60;
		
		//通过将总分钟数totalMinutes除以60获取总的小时数totalHours
		long totalHours = totalMinutes / 60;
		
		//通过totalHours % 24 得到当前的小时数
		long currentHour = totalHours % 24;
		currentHour += 8;
		
		//显示结果
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
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
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	
	public static int getTotalNumberOfDays(int year, int month){
		int total = 0;
		for(int i = 1800; i < year; ++i)
			if(isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;
		for(int i = 1; i < month; ++i)
			total = total + getNumberOfDayInMonth(year, i);
		return total;
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