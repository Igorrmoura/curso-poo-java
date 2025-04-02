package programTV;

import java.util.Locale;

import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		 System.out.println();
		 System.out.println("Productdata: "+ product);
		 System.out.println();
		 System.out.print("Enter the number of products to be added in stock: ");
		 
		 int quantity= sc.nextInt();
		 product.addproducts(quantity);
		 System.out.println();
		 System.out.println("Updateddata: "+ product);
		 System.out.println();
		 System.out.print("Enter the number of products to be removed from stock: ");
		 
		 quantity= sc.nextInt();
		 product.removeproducts(quantity);
		 System.out.println();
		 System.out.println("resulted: "+ product);
		
		
		sc.close();
	}

}
