package Remove11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; ++i) {
			list.add(new Integer(sc.nextInt()));	
		}
		Remove.removeDuplicate(list);
	}
	
}
