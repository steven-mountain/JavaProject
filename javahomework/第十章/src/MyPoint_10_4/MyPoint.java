package MyPoint_10_4;

public class MyPoint {
	 private double x;
	 private double y;
	 
	public MyPoint() {
		super();
		x = 0;
		y = 0;
	}
	
	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint my) {
		return Math.sqrt((this.x - my.getX()) * (this.x - my.getX()) + (this.y - my.getY()) * (this.y - my.getY()));
	}
	
	 public double distance(double x, double y) {
		 return Math.sqrt((this.x - x) * (this.x- x) + (this.y - y) * (this.y - y));
		 
	 }

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	 
}
