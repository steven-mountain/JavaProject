class RoundNumber{
	public static void main(String[] args){
		int count = 0;
		int line = 0;
		int i = 2;
		while(count < 100){
			if(isPalindrome(i) && isPrime(i)){
				++count;
				++line;
				System.out.print(i + " ");
			}
			if(line == 10){
				line = 0;
				System.out.println();
			}
			++i;
		}
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
	
	public static boolean isPrime(int number){
		int i = 2;
		int temp = (int)Math.sqrt(number);
		for(;i < temp; ++i){
			if(number % i == 0)
				break;
		}
		if(i >= temp)
			return true;
		return false;
	}
}
