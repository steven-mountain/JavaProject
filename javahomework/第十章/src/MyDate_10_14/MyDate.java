package MyDate_10_14;

import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
	public int year;
	public int month;
	public int day;
	
	public MyDate() {
		super();
		GregorianCalendar g = new GregorianCalendar();
		Date d = g.getTime();
		year = d.getYear();
		month = d.getMonth() - 1;
		day = d.getDay();
		// TODO Auto-generated constructor stub
	}
	public MyDate(long mini) {
		super();
		Date d = new Date(mini);
		year = d.getYear();
		month = d.getMonth() - 1;
		day = d.getDay();
		// TODO Auto-generated constructor stub
	}
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setDate(long elapsedTime) {
		Date d = new Date(elapsedTime);
		year = d.getYear();
		month = d.getMonth() - 1;
		day = d.getDay();
		
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
}
