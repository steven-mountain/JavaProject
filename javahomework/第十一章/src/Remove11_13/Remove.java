package Remove11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i < list.size(); ++i) {
			if(!temp.contains(list.get(i))){
				temp.add(list.get(i));
			}
		}
		System.out.print("The distinc integers are ");
		for(int i = 0; i < temp.size(); ++i) {
			System.out.print(" " + temp.get(i).intValue());
		}
	}
}
