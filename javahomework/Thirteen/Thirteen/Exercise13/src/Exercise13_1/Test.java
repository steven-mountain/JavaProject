package Exercise13_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Trangle t = new Trangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三角行的三边");
		t.setEdg1(sc.nextDouble());
		t.setEdg2(sc.nextDouble());
		t.setEdg3(sc.nextDouble());
		System.out.println("你所输入的三角形的颜色是？");
		t.setColor(sc.next());
		System.out.println("你所输入的三角行填充与否？（是：true；否:false）");
		t.setFilled(sc.nextBoolean());
		System.out.println(t.toString());
	}
}
