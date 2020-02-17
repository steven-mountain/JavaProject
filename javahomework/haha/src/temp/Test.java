package temp;

public class Test {
	public static void main(String[] args) {
		int count = 10;
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append("java");
		sb.insert(0, new String(count + " "));
		System.out.println(sb.toString());
	}
}
