package HugeHomeWork.src.ShopingCart;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductList {
	private static ArrayList<Product> list = new ArrayList<Product>();
	
	public static void getList() {
		list.add(new Product(1.0, "a"));
		list.add(new Product(2.0, "b"));
		list.add(new Product(3.0, "c"));
		list.add(new Product(4.0, "d"));
		list.add(new Product(5.0, "e"));
		list.add(new Product(6.0, "f"));
		list.add(new Product(7.0, "g"));	
	}
	
	public static void showList() {
		Iterator<Product> it = list.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			System.out.println("Ãû³Æ£º" + p.name + ";  µ¥¼Û£º$" + p.price);
		}
		
	}

}
