package Exercises12_8;
import java.util.Scanner;

public class omy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数：");
		String hexString = sc.nextLine();
		try {
			System.out.println(hexToDec(hexString));
		}catch (NumberFormatException n) {
			
		}
	}
	public static int hexToDec(String hexString) {
		int decimalValue = 0;
		for(int i = 0; i < hexString.length(); ++i) {
			char hexChar = hexString.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return 0;
	}
	private static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if(ch >= '0' && ch <= '9')
			return  ch - '0';
		else
			throw new NumberFormatException("这不是一个二进制数");
	}
} 
