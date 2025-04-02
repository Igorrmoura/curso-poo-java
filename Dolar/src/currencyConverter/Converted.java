package currencyConverter;

public class Converted {
	
	public static double IOF = 0.06;
	
	public static double dollartotal(double addqDollar, double priceDollar) {
		return addqDollar * priceDollar * (1.0 + IOF);
	}

}
