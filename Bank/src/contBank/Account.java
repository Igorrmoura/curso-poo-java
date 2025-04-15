package contBank;

import java.util.Scanner;
import custumer.CustBank;

public class Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CustBank bank = new CustBank();
		
		System.out.print("informe o numero da conta: ");
		bank.number = sc.nextDouble();
		System.out.print("informe o nome da conta: ");
		bank.name = sc.next();
		System.out.print("valor a ser depositado: ");
		bank.deposito = sc.nextDouble();
		
		System.out.println("conta: " + bank.number + ", " + "nome: " + bank.name + ", " + "valor na conta: " + bank.totalcont());


	}

}
