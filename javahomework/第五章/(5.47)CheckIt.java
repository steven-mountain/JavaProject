import java.util.Scanner;
class CheckIt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int[] number = new int[12];
		int sum = 0;
		int temp;
		//ÊäÈëISBNÂë
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string :" );
		s = sc.next();
		if(s.length() != 12)
			System.out.println(s + " is an invalid input");
		else{
			for(int i = 0; i < 12; ++i){
				number[i] = (int)(s.charAt(i) - 48);
				if((i + 1) % 2 == 0)
					sum += (3 * number[i]);
				else
					sum += number[i];
			}
			temp = 10 - (sum % 10);
			System.out.print("The ISBN-13 number is " + s);
			if(temp == 10)
				System.out.println(0);
			else
				System.out.println(temp);
		}
	}
}