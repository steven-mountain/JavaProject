package MyDate_10_14;

import java.util.Date;

public class MyDateTest {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(34355555133101L);
		System.out.println("d1's yaer: " + d1.getYear() + "\td1's month:" + d1.getMonth() + "\nd1's day" + d1.getDay());
		System.out.println("d2's yaer: " + d2.getYear() + "\td2's month:" + d2.getMonth() + "\nd2's day" + d2.getDay());
	
	}
	
}
