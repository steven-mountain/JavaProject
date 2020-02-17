package Exercise13_16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String order = sc.nextLine();
//		String[] s = order.split("\\+ +");
		Pattern p = Pattern.compile("[0-9]+");
		int[] num = new int[4];
		int k = 0;
		Matcher m = p.matcher(order);
		while(m.find()) {
			num[k++] = Integer.parseInt(m.group());
		}
		int up = num[0] * num[3] + num[2] * num[1];
		int low = num[1] * num[3];
		int both = gcd(up, low);
		System.out.println(order + " = " + (up / both) + "/" + (low / both));
		
	}
	
	public static int gcd(int a, int b){
	    if(a < b){
	        a = a ^ b;
	        b = b ^ a;
	        a = a ^ b;
	    }
	    if(b == 0){
	        return a;
	    }
	    else{
	        return gcd(b, a % b);
	    }
	}
}
