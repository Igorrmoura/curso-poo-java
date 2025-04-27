package contBank;

import java.util.Scanner;
import custumer.CustBank;

public class Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CustBank bank;  
		
		System.out.print("informe o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("informe o nome da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("deseja fazer um deposito inicial (y/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("digite o valor do deposito inicial: ");
			double inicialdeposit = sc.nextDouble();
			bank = new CustBank(titular, number, inicialdeposit);
		} 
		else {
			bank = new CustBank (titular, number);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.println("digite o valor de deposito: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		System.out.println("updated account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("digite o valor de retirada: ");
		double withdrawValue = sc.nextDouble();
		bank.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(bank);
				
		
		
		sc.close();
	}

}
