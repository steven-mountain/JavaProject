package StackOfIntegers_10_5;

import java.util.Scanner;
import java.util.Stack;

public class StackOfIntegersTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();
		StackOfIntegers s = new StackOfIntegers();
		
		int i = 2;
		while(i <= num) {
			if(num % i == 0) {
				s.push(i);
				num /= i;
				i = 2;
				continue;
			}
			++i;
		}
		
		while(!s.empty()) {
			System.out.print(s.pop() + " ");
		}
		System.out.println();
	}
}
