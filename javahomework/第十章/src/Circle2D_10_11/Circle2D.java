package Circle2D_10_11;

public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	
	
	public Circle2D() {
		super();
		x = 0;
		y = 0;
		radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	} 
	
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	
	public boolean contains(double x, double y) {
		if(Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y) ) <= radius)
			return true;
		return false;
	}
	

	public boolean contains(Circle2D circle) {
		if(Math.sqrt((x - circle.getX())* (x - circle.getX()) + 	(y - circle.getY()) * 	(y - circle.getY())) + (radius > circle.radius ? circle.radius : radius)<= (radius < circle.radius ? circle.radius : radius))
			return true;
		return false;
	}
	
	public boolean overlaps(Circle2D circle) {
		if(Math.sqrt((x - circle.getX())* (x - circle.getX()) + 	(y - circle.getY()) * 	(y - circle.getY())) < radius + circle.radius)
			return true;
		return false;
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
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
