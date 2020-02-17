package MyInteger_10_3;

public class MyInteger {
	private int value;



	public int getValue() {
		return value;
	}

	public MyInteger(int value) {
		super();
		this.value = value;
	}

	public boolean isEven() {
		if(value % 2 == 0)
			return true;
		return false;
	}
	
	public static boolean isEven(int value) {
		if(value % 2 == 0)
			return true;
		return false;
	}
	
	
	public boolean isOdd() {
		if(value % 2 != 0)
			return true;
		return false;
	}
	
	public static  boolean isOdd(int value) {
		if(value % 2 != 0)
			return true;
		return false;
	}
	
	public boolean isPrime() {
		int prescribe  = (int)Math.sqrt(value);
		for(int i = 2; i < prescribe; ++i)
			if(value / i == 0)
				return false;
		return true;
	}
	
	public static boolean isPrime(int value) {
		int prescribe  = (int)Math.sqrt(value);
		for(int i = 2; i < prescribe; ++i)
			if(value / i == 0)
				return false;
		return true;
	}
	
	public boolean equals(int value) {
		if(value == this.getValue())
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger my) {
		if(my.getValue() == this.getValue())
			return true;
		return false;
	}
	
	public static int parseInt(char[] A) {
		String s = "";
		for(int i = 0; i < A.length; ++i) {
			s += A[i];
		}
		return Integer.valueOf(s);
	}
	
	public static int parseInt(String s) {
		return Integer.valueOf(s);
	}
}
