package Exercises12_1;

import java.util.Scanner;

public class AnotherTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String order = sc.nextLine();
		String[] num = order.split(" ");
		double result = 0;
		String s = getResult(num);
		if(s.matches("[0-9]+[.][0-9]+")) {
			System.out.println(order + " = " + s);
		}else {
			System.out.println("Wrong input: " + s);
		}
	}
	
	public static String getResult(String[] s) {
		double num = 0;
		StringBuilder sb = new StringBuilder();
		if(!s[0].matches("[^0-9]+")) {
			return s[0];
		}
		else if(!s[2].matches("[^0-9]+")) {
			return s[2];
		}
		else {
			switch(s[1].toString()) {
				case"+":
					sb.append(new Double(Double.parseDouble(s[0]) + Double.parseDouble(s[2])).toString());
					break;
				case"-":
					sb.append(new Double(Double.parseDouble(s[0]) - Double.parseDouble(s[2])).toString());
					break;
				case"*":
					sb.append(new Double(Double.parseDouble(s[0]) * Double.parseDouble(s[2])).toString());
					break;
				case"/":
					sb.append(new Double(Double.parseDouble(s[0]) / Double.parseDouble(s[2])).toString());
					break;
				default:
					break;
			}
		}
		return sb.toString();
	}
}