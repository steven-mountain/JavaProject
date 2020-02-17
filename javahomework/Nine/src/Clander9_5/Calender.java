package Clander9_5;
import java.util.GregorianCalendar;

public class Calender {
	public static void main(String[] args){
		GregorianCalendar gC = new GregorianCalendar();
		int year = gC.get(GregorianCalendar.YEAR);
		int month = gC.get(GregorianCalendar.MONTH);
		int day = gC.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Current time is: YEAR: " +year + "  MONTH :" + month + " DAY : " + day);
		System.out.println("------------------------------");
		
		gC.setTimeInMillis(1234567898765L);
		year = gC.get(GregorianCalendar.YEAR);
		month = gC.get(GregorianCalendar.MONTH);
		day = gC.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Current time is: YEAR: " +year + "  MONTH :" + month + " DAY : " + day);
	}
}
