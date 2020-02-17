package Exercise13_12;

import Exercise13_1.GeometricObject;

public class Rectangle extends GeometricObject{

	public double height = 0;
	public double widhth = 0;
	
	
	public Rectangle(double height, double widhth) {
		super();
		this.height = height;
		this.widhth = widhth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * widhth;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
