package Triangle11_1;

public class GeomotricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	
	public GeomotricObject() {
		super();
		dateCreated = new java.util.Date();
		// TODO Auto-generated constructor stub
	}

	public GeomotricObject(String color, boolean filled) {
		super();
		dateCreated = new java.util.Date();
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

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "Created on " + dateCreated + "\ncolr: " + color
				+ " and filled: " + filled;
	}

	
}
