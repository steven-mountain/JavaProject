import java.util.Scanner;
class PrintCalender{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int week = sc.nextInt();
		int monthDay;
		int month = 1;
		for(int x = 0; x < 12; ++x){
			System.out.println();
			System.out.println("\t\t" + whichMonth(month) + year);
			System.out.println("---------------------------------------------------------");
			monthDay = monthDay(month, year);
			week = printCalender(monthDay, week);
			
			++month;
		}
	}	
	public static String whichMonth(int month){
		String mon = "";
		switch(month){
			case 1:
				mon = "January";
				break;
			case 2:
				mon = "February";
				break;
			case 3:
				mon = "March";
				break;
			case 4:
				mon = "April";
				break;
			case 5:
				mon = "May";
				break;
			case 6:
				mon = "June";
				break;
			case 7:
				mon = "July";
				break;
			case 8:
				mon = "Aguest";
				break;
			case 9:
				mon = "September";
				break;
			case 10:
				mon = "October";
				break;
			case 11:
				mon = "November";
				break;
			case 12:
				mon = "December";
				break;
		}	
		return mon;
	}
	public static int printCalender(int monthDay, int week){
		//System.out.println("--------------------------------------");
		System.out.println("Sum\tMon\tTue\tWed\tThu\tFri\tSat\t");
		//先打印空格
		for(int i = 1; i <= week; ++i){
				System.out.print("\t");
		}
		//再打印日历
		for(int j = 1; j <= monthDay; ++j){
			System.out.print(j + "\t");
			++week;
			//每七天打印一个空格，同时将week重置为0；
			if(week == 7){
				System.out.println();
				week = 0;
			}
		}
		//System.out.println("--------------------------------------");
		return week;
	}
	public static int monthDay(int month, int year){
		int theDay = 0;
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				theDay = 31;
				break;
			case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
					theDay = 29;
					break;
				}else{
					theDay = 28;
					break;
				}
			case 4: case 6: case 9: case 11:
				theDay = 30;
				break;
		}
		return theDay;
	}
	
}