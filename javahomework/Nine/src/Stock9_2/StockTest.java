package Stock9_2;

public class StockTest {
	public static void main(String[] args){
		Stock s = new Stock("ORCL", "Oracle Corporation");
		s.previousClosingPrice = 34.5;
		s.currentPrice = 34.35;
		System.out.println("The rate is :" + s.getChangePercent(s.previousClosingPrice, s.currentPrice));
	}
}
