package Chaos11_7;

import java.util.ArrayList;

public class Chaos {
	public static void shuffle(ArrayList<Integer> list) {
		int num = list.size();
		Integer temp;
		while(num != 0) {
			int j = (int)(Math.random() * num--);
			temp = list.get(j);
			list.set(j, list.get(num));
			list.set(num, temp);
		}		
	}
}
