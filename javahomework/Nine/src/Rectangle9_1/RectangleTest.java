package Rectangle9_1;

public class RectangleTest {
	public static void main(String[] args){
		Rectangle rc1 = new Rectangle(4, 40);
		Rectangle rc2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The first rectangle' width : " + rc1.width + " height: " + rc1.height + " area: " + rc1.getArea(rc1.width, rc1.height) + " grith: " + rc1.getPerimeter(rc1.width, rc1.height));
		System.out.println("The first rectangle' width : " + rc2.width + " height: " + rc2.height + " area: " + rc2.getArea(rc2.width, rc2.height) + " grith: " + rc2.getPerimeter(rc2.width, rc2.height));
	}
}
