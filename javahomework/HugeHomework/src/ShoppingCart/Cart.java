package ShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
	ArrayList<Product> ct = new ArrayList<Product>();
	//遍历购物车
	public void list() {
		Iterator<Product> it = ct.iterator();
		if(ct.size() == 0) {
			System.out.println("你的购物车是空的");
			return;
		}
		System.out.println("你的购物车有以下商品");
		while(it.hasNext()) {
			Product p = (Product)it.next();
			System.out.println("商品名称： " + p.name + "； 商品价格：" + p.price + "; 商品数量：" + p.number);
		}
	}
	
	//添加商品
	public void add(String name, double price, double number) {
		ct.add(new Product(name, price, number));
	}
	
	//删除商品
	public void del(String name) {
		if(ct.size() == 0) {
			System.out.println("你的购物车没有商品");
			return;
		}
		else {
			for(int i = 0; i < ct.size(); ++i) {
				if(ct.get(i).name.equals(name)) {
					ct.remove(i);
					return;
				}
			}
		}
		System.out.println("你的购物车里没有该商品");
	}

	//求出总费用
	public double getSum() {
		Iterator<Product> it = ct.iterator();
		double sum = 0;
		while(it.hasNext()) {
			Product p = (Product)it.next();
			sum += p.getTotalFare();
		}
		return sum;
	}


}