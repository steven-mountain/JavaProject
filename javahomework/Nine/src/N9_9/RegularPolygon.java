package N9_9;

public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	RegularPolygon(){
		side = 1;
		x = 0;
		y = 0;
		n = 3;
	}
	RegularPolygon(int n, int side){
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, int side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
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
	
	public double getPerimeter() {
		return n * side;
	}
	public double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}
}
