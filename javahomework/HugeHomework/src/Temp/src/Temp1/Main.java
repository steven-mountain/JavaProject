package Temp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double[] num = new double[number];
		int tempNum = 0;
		int index = 0;
		double current = 0;
		for(int i = 0; i < number; ++i){
			tempNum = sc.nextInt();
			for(int j = 0; j < tempNum; ++j){
				index = sc.nextInt();
				current = sc.nextDouble();
				num[index - 1] += current;
				num[i] -= current;
			}
		}
		ArrayList<Person> array = new ArrayList<Person>(number);
		for(int i = 0; i < num.length; ++i){
			array.add(new Person(i + 1, num[i]));
		}
		
		for(int i = 0; i < number - 1; ++i) {
			for(int j = 0; j < number - i - 1; ++j) {
				if(array.get(j).money < array.get(j + 1).money) {
					Person temp = array.get(j + 1);
					array.set(j + 1, array.get(j));
					array.set(j, temp);
				}
			}
		}
		
		for(Person p : array) {
			System.out.println(p.num + "  " + p.money);
		}
		sc.close();
	}
}

class Person{
	public int num = 0;
	public double money = 0;
	public int numOfH = 0;
	
	public Person(int num, double money) {
		super();
		this.num = num;
		this.money = money / 100;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
