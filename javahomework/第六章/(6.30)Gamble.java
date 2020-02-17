class Gamble{
	public static void main(String[] args){
		//System.out.println(outNumber());
		int one = 0;
		int two = 0;
		int sum = 0;
		
		while(true){
			one = outNumber();
			two = outNumber();
			sum = one + two;
			if(sum == 2 || sum == 3 || sum == 12){
				printOut(one, two);
				System.out.println("You lose");
				break;
			}else if(sum == 7 || sum == 11){
				printOut(one, two);
				System.out.println("You win");
				break;
			}else{
				printOut(one, two); 
				System.out.println("point is " + sum);
				int i = 0;
				int j = 0;
				int k = 0;
				while(true){
					i = outNumber();
					j = outNumber();
					k = i + j;
					if(k == sum){
						printOut(i, j);
						System.out.println("You win");
						break;
					}else if(k == 7){
						printOut(i, j);
						System.out.println("You lose");
						break;
					}
				}
				break;
			}
		}
	}
	
	public static int outNumber(){
		int number = (int)(1 + Math.random() * 6);
		return number;
	}
	public static void printOut(int numberOne, int numberTwo){
		System.out.println("Your rolled " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
	}
}