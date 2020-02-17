package BankAccountManager;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Checking ch = new Checking(1000, "888");
		System.out.println("showMenu20");
		System.out.println(ch.getAccount());
		System.out.println("deposit20");
		ch.deposit(20);
		System.out.println(ch.getAccount());
		ch.withdraw(20);
		System.out.println("withdraw20");
		System.out.println(ch.getAccount());
		System.out.println("overDraft");
		System.out.println(ch.getAccount());
	}
}
