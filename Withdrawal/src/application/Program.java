package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BusinessExceptions;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account data: ");
		int number = sc.nextInt();
		System.out.print("holder of account: ");
		String holder = sc.next();
		System.out.print("saldo inicial: ");
		double initialBalance = sc.nextDouble();
		System.out.print("limite de saque: ");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.println("saldo atual: " + acc.getBalance());
		} catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}
	}

}
