import java.util.Scanner;
class NumberOfTimes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] bucket = new int[101];
		int x = 0;
		int i = 0;
		System.out.println("Enter a number until is zero");
		x = sc.nextInt();
		while(x != 0){
			++bucket[x];
			x = sc.nextInt();
		}
		for(int j = 0; j < 101; ++j){
			if(bucket[j] != 0){
				System.out.println(j + " occurs " + bucket[j] + " times");
			}
		}
	}
	
}