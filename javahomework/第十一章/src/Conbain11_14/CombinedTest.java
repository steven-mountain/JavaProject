package Conbain11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinedTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; ++i) {
			if(i < 5)
				list1.add(new Integer(sc.nextInt()));	
			else
				list2.add(new Integer(sc.nextInt()));
		}
		
		ArrayList<Integer> result = Combined.union(list1, list2);
		System.out.print("The combined list is ");
		for(int i = 0; i < result.size(); ++i)
			System.out.print(" " + result.get(i).intValue());
	}
}
