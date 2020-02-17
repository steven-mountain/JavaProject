import java.util.Scanner;
public class Equals {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int temp = 0;
		int sum = 0;
		while(true){
			for(int i = 0; i < 4; ++i){
				temp = 1 + (int)(Math.random() * 13);
				sum += temp;
			}
			++count;
			if(sum == 24)
				break;
			else
				sum = 0;
		}
		System.out.println("You got 24 for " + count + " times");
	}
}