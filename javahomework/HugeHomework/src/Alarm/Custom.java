package Alarm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Custom {
	
	private String event = "";
	private int year;
	private int month;
	private int day;
	private int hour ;
	private int minute ;
	private int second ;
	
	public Custom() {}
	
	public Custom(String event,int year, int month, int day, int hour, int minute, int second) {
		this.event = event;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Calendar c = new GregorianCalendar();
	
	/*public void setTimeOfAlarm(int year, int month, int day, int hour, int minute, int second) {
		this.c.set(year, month, day, hour, minute, second);
	}*/
	
	public void setTimeOfAlarm() {
		this.c.set(year, month, day, hour, minute, second);
	}
	
	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}	
	

}
