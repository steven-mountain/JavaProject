package Exercises12_1;

import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String order = sc.nextLine();
		String[] num = order.split(" ");
		double result = 0;
			try {
				result = getResult(num);
				System.out.println(order + " = " + result);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static double getResult(String[] s) throws NumberFormatException {
		double num = 0;
		if(s[0].matches("[^0-9]+")) {
			throw new NumberFormatException("Wrong input: " + s[0]);
		}
		else if(s[2].matches("[^0-9]+")) {
			throw new NumberFormatException("Wrong input: " + s[2]);
		}
		else {
			switch(s[1].toString()) {
				case"+":
					num = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
					break;
				case"-":
					num = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
					break;
				case"*":
					num = Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
					break;
				case"/":
					num = Double.parseDouble(s[0]) / Double.parseDouble(s[2]);
					break;
				default:
					break;
			}
		}
		return num;
	}
}
