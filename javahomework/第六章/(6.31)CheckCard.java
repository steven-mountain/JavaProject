import java.util.Scanner;
class CheckCard{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long interger: ");
		long number = sc.nextLong();
		if(isValid(number))
			System.out.println(number + " is valid");
		else
			System.out.println(number + " is invalid");
	}
	
	public static boolean isValid(long number){
		int temp = (int)getPrefix(number, 1);
		if(number > 999999999999L && number < 9999999999999999L){
			if(temp == 4 || temp == 5 || temp == 6 || getPrefix(number, 2) == 37){
				if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0){
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}else
			return false;
	}
	
	public static int sumOfDoubleEvenPlace(long number){
		int size = getSize(number);
		int[] temp = new int[size];
		int sum = 0;
		for(int i = size - 1; i >= 0; --i){
			temp[i] = (int)(number % 10);
			number /= 10;
		}
		for(int i = 0; i < size; ++i){
			if(i % 2 == 0)
			sum += getDigit((temp[i] * 2));
		}
		
		return sum;
	}
	
	public static int getDigit(int number){
		if(number < 10)
			return number;
		else
			return (number % 10 + number / 10);
	}
	
	public static int sumOfOddPlace(long number){
		int size = getSize(number);
		int[] temp = new int[size];
		int sum = 0;
		for(int i = size - 1; i >= 0; --i){
			temp[i] = (int)(number % 10);
			number /= 10;
		}
		for(int i = 0; i < size; ++i){
			if(i % 2 != 0){
				sum += temp[i];
			}
		}
		return sum;
	}
	
	public static boolean prefixMathched(long number, int d){
		if(getPrefix(number, getSize(d)) == d)
			return true;
		return false;
	}
	
	public static int getSize(long d){
		int i = 0;
		while(d > 0){
			++i;
			d /= 10;
		}
		return i;
	}
	
	public static long getPrefix(long number, int k){
		int judge = (int)Math.pow(10, k - 1);
		long temp = 0;
		if(number >= judge){
			temp = number / (long)Math.pow(10, getSize(number) - k);
			return temp;
		}else{
			return number;
		}
	}
}