package Exercise13_1;

import java.util.Date;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {
		super();
		dateCreated = new Date();
		// TODO Auto-generated constructor stub
	}

	public GeometricObject(String color, boolean filled) {
		super();
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled
				+ ", dateCreated=" + dateCreated + "]";
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
