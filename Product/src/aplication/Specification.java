package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Productss;
import entities.UsedProducts;

public final class Specification {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Productss> list = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported(c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Customsfee: ");
				double Customsfee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, Customsfee));

			} else if (ch == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProducts(name, price, date));
			} else {
				list.add(new Productss(name, price));
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Productss pts : list) {
			System.out.println(pts.TagPrice());
		}

		sc.close();

	}

}
