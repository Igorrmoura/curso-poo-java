package products;

import java.util.Locale;
import java.util.Scanner;

import exercVet.Vects;

public class Productss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("quantos numeros vocÊ vai digitar:  ");
		
		int n = sc.nextInt();
		double soma, media; 
		
		double[] vect = new double[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.print("digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		soma = 0;
		double sum = 0.0;
		for (int i = 0; i<vect.length; i++) {
			soma = soma + vect[i];
		}

	}

}
