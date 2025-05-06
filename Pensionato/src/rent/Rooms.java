package rent;

import java.util.Scanner;

import client.Dados;

public class Rooms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Dados[] vect = new Dados[10];

		System.out.print("quantos quartos serão alugados: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("aluguel: #" + (i + 1));
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Dados(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}

	}

}
