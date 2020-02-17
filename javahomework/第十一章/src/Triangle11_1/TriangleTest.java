package Triangle11_1;

import java.util.Scanner;



public class TriangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三角形的三边");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		
		System.out.println("请输入三角形的颜色");
		String color = sc.next();
		
		System.out.println("是否填充？（是：true； 否：false）");
		String fill = sc.next();
		
		boolean filled = false;
		if(fill.equals("true"))
			filled = true;
		else if(fill.equals("false"))
			filled = false;
	
		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);
		
		//显示三角形的基本信息
		System.out.println("area: " + t.getArea() + t.toString() + "; color: " + t.getColor() + "; filled: " + t.isFilled());
	}
}
