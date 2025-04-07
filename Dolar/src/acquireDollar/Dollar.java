package acquireDollar;

import java.util.Locale;
import java.util.Scanner;
import currencyConverter.Converted;

public class Dollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("whats is the dollar price: ");
		double priceDollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		 double addqDollar = sc.nextDouble();
		
		 double result =  Converted.dollartotal(addqDollar, priceDollar);
		System.out.printf("Amount to be paid in reais= %.2f%n", result +  Converted.IOF);
		
		
		sc.close();

	}

}
