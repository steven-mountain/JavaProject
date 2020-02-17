package MyInteger_10_3;

public class MyIntegerTest {
	public static void main(String[] args) {
		MyInteger my = new MyInteger(88);
		MyInteger my1 = new MyInteger(79);
		 System.out.println("my.isEven:" + my.isEven() + "  my.isOdd:" + my.isOdd() + " my.isPrime:" + my.isPrime());
		 
		 System.out.println("static version isEven, isOdd, isPrime the test num is 67");
		 System.out.println("" + MyInteger.isEven(67) + MyInteger.isOdd(67) + MyInteger.isPrime(67));
		 
		 System.out.println("test equals");
		 System.out.println("my.equals(67)  " + my.equals(67) + "\tequals(MyInterger)  " + my.equals(my1));
		 
		 System.out.println("test parseInt(char[]): ch[] = {'1', '2', '3', '4'}"	);
		 char[] ch = 	{'1', '2', '3', '4'};	 
		 System.out.println(MyInteger.parseInt(ch));
		 
		 System.out.println("test parseInt(char[]): s = \"1234\"");
		 String s = "1234";
		 System.out.println(MyInteger.parseInt(s));
	}
}
