import java.util.Scanner;
class CountTimes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] bucket = new int[10];
		int x = 0;
		int i = 0;
		System.out.println("Enter a number until is zero");
		while(i < 100){
			x = (int)(10 * Math.random());
			++bucket[x];
			++i;
		}
		for(int j = 0; j < 10; ++j){
			if(bucket[j] != 0){
				System.out.println(j + " occurs " + bucket[j] + " times");
			}
		}
	}
}