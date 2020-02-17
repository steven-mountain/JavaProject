package Stock9_2;

public class Stock {
	String symbol = "";
	String name = "";
	double previousClosingPrice = 0;
	double currentPrice = 0;
	
	Stock(){
		symbol = "007";
		name = "special";
	}
	
	Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	double getChangePercent(double previousClosingPrice, double currentPrice){
		return Math.abs(previousClosingPrice - currentPrice) / previousClosingPrice;
	}
}
