package Triangle2D_10_12;

import MyPoint_10_4.MyPoint;

public interface PointTools {
//	public abstract boolean  getPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4);
	public abstract double getArea(MyPoint p1, MyPoint p2, MyPoint p3);
	
	public abstract boolean isIn(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4);

}
