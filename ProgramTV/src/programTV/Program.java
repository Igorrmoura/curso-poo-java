package programTV;

import java.util.Locale;

import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		
		product.setName("pc");
		System.out.println("updated name: " + product.getName());
		
		 System.out.println();
		 System.out.println("Productdata: "+ product);
		 System.out.println();
		 System.out.print("Enter the number of products to be added in stock: ");
		 
		  quantity= sc.nextInt();
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
