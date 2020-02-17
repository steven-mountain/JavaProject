package ArryList11_4;

import java.util.ArrayList;

public class ArryListTest {
	public static Integer max(ArrayList<Integer> list){
		if(list.size() == 0 || list == null)
			return null;
		
		Integer max = list.get(0);
		for(int i = 1; i < list.size(); ++i){
			if(list.get(i).intValue() > max.intValue())
				max = list.get(i);
		}
		return max;
	}
}
