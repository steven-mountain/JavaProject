package PTA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		int numOfCourse = sc.nextInt();
		sc.next();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		String[] s = new String[numOfCourse];
		
		for(int i = 0; i < numOfCourse; ++i) {
			sc.nextLine();
			s[i] = sc.nextLine();
		}
		
		String[] students = sc.nextLine().split(" +");
		for(int i = 0; i < students.length; ++i) {
			sb.delete(0, sb.length());
			count = 0;
			for(int j = 0; j < s.length; ++j) {
				if(s[j].contains(students[i])) {
					sb.append((j + 1) + " ");
					++count;
				}
			}
			sb.insert(0, new String(count + " "));
			sb.insert(0, students[i] + " ");
			System.out.println(sb.toString().trim());
		}
	}
}

