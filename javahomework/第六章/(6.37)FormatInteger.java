import java.util.Scanner;
class FormatInteger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Enter the width: ");
		int width = sc.nextInt();
		String s = format(number, width);
		System.out.println(s);
	}
	public static String format(int number, int width){
		String s = "";
		if(number > (int)(Math.pow(10, width - 1)))
			return s + number;
		else{
			for(int i = 0; i < width - getSize(number); ++i)
				s += "0";
			s += number;
			return s;
		}
	}
	
	public static int getSize(int d){
		int i = 0;
		while(d > 0){
			++i;
			d /= 10;
		}
		return i;
	}
}