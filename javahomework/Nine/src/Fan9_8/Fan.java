package Fan9_8;

public class Fan {
	final static int SLOW = 1;
	final static int medium = 2;
	final static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	public void setSpeed(int speed){
		if(speed < 4 && speed > 0)
		this.speed = speed;
	}
	
	public int getSpeed(){
		return speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String s = "";
		if(isOn())
			s += ""+ getSpeed()+getColor()+ getRadius();
		else
			s += "fan is off" + getColor()+ getRadius();
		return s;
	}
}
