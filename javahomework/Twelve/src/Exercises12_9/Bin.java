package Exercises12_9;

import java.util.Scanner;

public class Bin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数：");
		String hexString = sc.nextLine();
		try {
			System.out.println(bin2Dec(hexString));
		}catch (NumberFormatException n) {
			
		}
	}
	public static int bin2Dec(String hexString) {
		int decimalValue = 0;
		for(int i = 0; i < hexString.length(); ++i) {
			char hexChar = hexString.charAt(i);
			try {
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			} catch (BinaryFormationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	private static int hexCharToDecimal(char ch) throws BinaryFormationException {
		if(ch == '0' || ch == '1')
			return ch - '0';
		else
			throw new BinaryFormationException("这不是一个二进制数");
	}
}