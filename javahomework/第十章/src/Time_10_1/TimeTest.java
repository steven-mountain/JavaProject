package Time_10_1;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		Time t2 = new Time(555550000);
		System.out.println("hour = " + t.getHour() + " minute = " + t.getMinute() + " second = " + t.getSecond());
		System.out.println("hour = " + t2.getHour() + " minute = " + t2.getMinute() + " second = " + t2.getSecond());
	}
}
