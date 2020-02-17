package HugeHomeWork.src.ShopingCart;

import java.util.Scanner;

import ShoppingCart.Cart;

public class ShoppingCartSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		Cart ct = new Cart();
		while(true){
			System.out.println("请输入指令：（showList: 显示商品清单； showCartList：显示购物车中的商品；add：添加商品；del：删除商品；getCount：结账; exit：退出）");
			sb.append(sc.next());
			if(sb.toString().equals("exit")) {
				System.out.println("Byebye~");
				break;
			}
			switch(sb.toString()) {
				case "showList": {
					ProductList.getList();
					ProductList.showList();
					break;
				}
				case"showCartList":{
					ct.list();
					break;
				}
				case"add":{
					System.out.println("请输入商品的名称单价和数量");
					ct.add(sc.next(), sc.nextDouble(), sc.nextDouble());
					break;
				}
				case"del":{
					System.out.println("请输入要删除的商品名");
					ct.del(sc.next());
					break;
				}
				case"getCount":{
					System.out.println(ct.getSum());
					break;
				}
				default:
					System.out.println("你输入的指令有误请重新输入");
					break;
			}
			sb.delete(0, sb.length());
		}
	}
}
