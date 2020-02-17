package GetSum11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSumTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		
		for(int i = 0; i < 5; ++i) {
			list.add(new Double(sc.nextDouble()));	
		}
		
		double sum = GetSum.sum(list);
		System.out.println(sum);
	}
}
