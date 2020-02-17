package ShoppingCart;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("13456");
		System.out.println(sb);
		System.out.println(sb.toString().equals("13456"));
		sb.delete(0, sb.length());
		System.out.println("-----------------");
		System.out.println(sb);
		System.out.println("-----------------");
	}
}
