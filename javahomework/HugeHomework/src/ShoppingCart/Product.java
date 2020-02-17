package ShoppingCart;

public class Product {
	double price;
	double number;
	String name;
	static double tax = 0.12;
	
	
	public Product(String name, double price, double number) {
		super();
		this.price = price;
		this.number = number;
		this.name = name;
	}
	
	public Product(double price, String name) {
		super();
		this.price = price;
		this.number = 0.0;
		this.name = name;
		
	}


	public double getTotalFare() {
		return number * price * (tax + 1);
	}
	
}
