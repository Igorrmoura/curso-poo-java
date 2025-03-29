package programFuncionario;

import java.util.Locale;
import java.util.Scanner;
import atributos.DadosFuncio;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DadosFuncio emp = new DadosFuncio();
		
		// entrada de dados do funcionario
		System.out.print("nome do funcionario: ");
		emp.name = sc.nextLine();
		System.out.print("salario: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("taxa: ");
		emp.tax = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("dadosFuncio: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("updade data: " + emp);
		
		sc.close();

	}

}
