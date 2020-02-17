import java.util.Scanner;
class CheckPassWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password");
		String s = sc.nextLine();
		if(check(s))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
		
	}
	public static boolean check(String s){
		int countNum = 0;
		int countLetter = 0;
		int i = 0;
		
		if(s.length() < 8)
			return false;
		else {
			while(i < s.length()){
				if(Character.isLetter(s.charAt(i)))
					++countLetter;
				else if(Character.isDigit(s.charAt(i)))
					++countNum;
				else
					return false;
				++i;
			}
			if(countLetter > 0 && countNum >=2)
				return true;
			return false;
		}
		
	}
	
}