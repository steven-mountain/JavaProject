import java.util.Scanner;
class IsRound{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(isPalindrome(number))
			System.out.println(number + " is palindrome");
		else
			System.out.println(number + " is not palindrome");
	}
	
	public static int reverse(int number){
		int out = 0;
		int[] temp = new int[10001];
		int i = 0;
		int q = 1;
		while(number >0){
			temp[i++] = number % 10;
			number /= 10;
		}
		
		for(int j = i - 1; j >= 0; --j){
			out += temp[j] * q;
			q *= 10;
		}
		return out;
	}

	public static boolean isPalindrome(int number){
		if(number == reverse(number))
			return true;
		return false;
	}
}