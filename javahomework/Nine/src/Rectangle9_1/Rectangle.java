package Rectangle9_1;

public class Rectangle {
	double width = 1;
	double height = 1;
		
	Rectangle () {}
		
	Rectangle(double width, double height){
		this.width = width;
		this.height =height;
	}
		
	double getArea(double width, double height){
		return width * height;
	}
	
	double getPerimeter(double width, double height){
		return 2 * (width + height);
	}
}
