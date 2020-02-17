package Triangle2D_10_12;

import MyPoint_10_4.MyPoint;

public class Triangle2D implements PointTools{
	MyPoint p1;
	MyPoint p2;
	MyPoint p3;
	
	public Triangle2D() {
		super();
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	double getArea() {
		double a = p1.distance(p2);
		double b = p1.distance(p3);
		double c = p2.distance(p3);
		double p =(a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	double getPerimeter() {
		double a = p1.distance(p2);
		double b = p1.distance(p3);
		double c = p2.distance(p3);
		return a + b + c;
	}
	
	@Override
	public double getArea(MyPoint p1, MyPoint p2, MyPoint p3) {
		// TODO Auto-generated method stub
		double a = p1.distance(p2);
		double b = p1.distance(p3);
		double c = p2.distance(p3);
		double p =(a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public boolean contains(MyPoint p) {
		if(getArea(p1, p2, p3) + getArea(p1, p3, p) + getArea(p2, p3, p) <= getArea(p1, p2, p3))
			return true;
		return false;
	}
	
	public boolean contains(Triangle2D t) {
		if(contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3()))
			return true;
		return false;
	}
	
	@Override
	public boolean isIn(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
		// TODO Auto-generated method stub
		double a = p1.getY() - p2.getY();
		double b = -1 * (p1.getX() - p2.getX());
		double e = (p1.getY() - p2.getY()) * p1.getX() - (p1.getX() - p1.getX()) * p1.getY();
		double c = p3.getY() - p4.getY();
		double d = -1* (p3.getY() - p4.getY());
		double f = (p3.getY() - p4.getY()) * p3.getX() - (p3.getX() - p4.getX()) * p3.getY();
		
		double  x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		if(x < (p3.getX() > p4.getX() ? p3.getX() : p4.getX()) && x > (p3.getX() < p4.getX() ? p3.getX() : p4.getX()) && y < (p3.getY() > p4.getY() ? p3.getY() : p4.getY()) && y > (p3.getY() < p4.getY() ? p3.getY() : p4.getY()))
			return true;
		return false;
	}
	
	public boolean overlaps(Triangle2D t) {
		if(isIn(p1, p2, t.getP1(), t.getP2()) || isIn(p1, p2, t.getP1(), t.getP3()) || isIn(p1, p2, t.getP2(), t.getP3()) || 
				isIn(p1, p3, t.getP1(), t.getP2()) || isIn(p1, p3, t.getP1(), t.getP3()) || isIn(p1, p3, t.getP2(), t.getP3()) ||
				isIn(p2, p3, t.getP1(), t.getP2()) || isIn(p2, p3, t.getP1(), t.getP3()) || isIn(p2, p3, t.getP2(), t.getP3())
				)
			return true;
		return false;
	}
	
	public MyPoint getP1() {
		return p1;
	}
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	public boolean getPoint() {
		
		return false;
	}
}
