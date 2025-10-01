package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		int number = sc.nextInt();
		System.out.println("holder of acoount: ");
		String holder = sc.next();
		System.out.println("saldo inicial: ");
		double initialBalance = sc.nextDouble();
		System.out.println("limite de saque");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		
		acc.withdraw(initialBalance);

	}

}
