class StockTest{
	public static void main(String[] args){
		Stock s = new Stock("ORCL", "Oracle Corporation");
		s.previousClosingPrice = 34.5;
		s.currentPrice = 34.35;
		System.out.println("The rate is :" + s.getChangePercent(s.previousClosingPrice, s.currentPrice));
	}
}

class Stock{
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