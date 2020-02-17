package Time_10_1;

import java.util.Date;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	@SuppressWarnings("deprecation")
	public Time() {
		super();
		Date time = new Date();
		hour = time.getHours();
		minute = time.getMinutes();
		second = time.getMinutes();
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(long elapseTime) {
		hour = (int)((elapseTime / 1000) / 3600);
		minute = (int)(((elapseTime / 1000) - hour * 3600) / 60);
		second = (int)((elapseTime / 1000) - hour * 3600 - minute * 60);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setTime(long elapseTime){
		hour = (int)((elapseTime / 1000) / 3600);
		minute = (int)(((elapseTime / 1000) - hour * 3600) / 60);
		second = (int)((elapseTime / 1000) - hour * 3600 - minute * 60);
	}
}
