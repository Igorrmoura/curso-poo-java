package testVet;
import java.util.Scanner;

import prods.Products;

public class Vets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Products[] vect = new Products[n]; 
		
		for (int i = 0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice(); 
		}
		
		double avg = sum / vect.length;
		System.out.printf("AVAREGE: %.2f%n", avg);

	}

}
