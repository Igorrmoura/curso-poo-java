package atributos;

public class DadosFuncio {
	public String name;
	public double grossSalary;
	public double tax;
	
	public Double netSalary() {
		return grossSalary - tax; 
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0; 
		
	}
	
	public String toString() {
		return name + " , $ " + String.format("%.2f", netSalary());
	}
	

}
