package Exercise13_2;

import java.util.ArrayList;

public class Disorder {
	public static void sort(ArrayList<Number> list){
		for(int i = 0,len = list.size(); i < len; i++){
			  int currentRandom = (int)(Math.random() * (len - 1));
			  Number temp;
			  temp = list.get(i);
			  list.set(i, list.get(currentRandom));
			  list.set(currentRandom, temp);
			}
	}
}
