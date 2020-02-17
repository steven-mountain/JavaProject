package Exercise13_17;

public class Complex {
	 public double a;
	 public double b;
	 
	public Complex() {
		super();
		a = 0;
		b = 0;
		// TODO Auto-generated constructor stub
	}
	
	public Complex(double a) {
		super();
		this.a = a;
		b = 0;
		// TODO Auto-generated constructor stub
	}

	public Complex(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	 
	public void add(Complex temp) {
		System.out.printf("(%.2f + %.2fi) + (%.2f + %.2fi) = %.2f + %.2fi\n", a, b, temp.a, temp.b, (a + temp.a), (b + temp.b));
	}
	
	public void substract(Complex temp) {
		System.out.printf("(%.2f + %.2fi) - (%.2f + %.2fi) = %.2f + %.2fi\n", a, b, temp.a, temp.b, (a - temp.a), (b - temp.b));
	}
	
	public void mutiply(Complex temp) {
		System.out.printf("(%.2f + %.2fi) * (%.2f + %.2fi) = %.2f + %.2fi\n", a, b, temp.a, temp.b, (a * temp.a - b * temp.b), (b * temp.a + a * temp.b));
	}
	
	public void divide(Complex temp) {
		System.out.printf("(%.2f + %.2fi) / (%.2f + %.2fi) = %.2f + %.2fi\n", a, b, temp.a, temp.b, ((a * temp.a + b * temp.b) / (temp.a * temp.a + temp.b * temp.b)), ((b * temp.a - a * temp.b) / (temp.a * temp.a + temp.b * temp.b)));
	}
	
	public void abs() {
		System.out.printf("|(%.2f + %.2f)| = %f\n", a, b, Math.sqrt((a * a + b * b)));
	}

	@Override
	public String toString() {
		return "" + a + "+" + b + "i";
	}
	
	public double getRealPart() {
		return a;
	}
	
	public double getImaginaryPart() {
		return b;
	}
}
