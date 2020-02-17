package Exercise13_3;

import java.util.ArrayList;

public class Sort {
	public static void sort(ArrayList<Number> list){
		for(int i = 0; i < list.size() - 1; ++i){
			for(int j = 0; j < list.size() - i - 1; ++j){
				if(list.get(j).doubleValue() > list.get(i).doubleValue()){
					Number temp;
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
