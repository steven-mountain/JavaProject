package Exercise13_8;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack {
	private ArrayList<Object> list = new ArrayList<Object>();
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int getSize(){
		return list.size();
	}
	
	public Object peek(){
		return list.get(getSize() - 1);
	}
	
	public Object pop(){
		return list.remove(getSize() - 1);
	}
	
	public void push(Object o){
		list.add(o);
	}
	
	public void copy(ArrayList<Object> list1, ArrayList<Object> list2){
		Iterator<Object> it = list1.iterator();
		while(it.hasNext()){
			list2.add(it.next());
		}
	}

	@Override
	public String toString() {
		return "MyStack [list=" + list + "]";
	}
	
	
}
