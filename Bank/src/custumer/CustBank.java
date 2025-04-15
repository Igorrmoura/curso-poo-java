package custumer;

public class CustBank {
	
	public String name;
	public double number;
	public double deposito;
	private double cont = 500;
	
	public double totalcont() {
		return deposito + cont;
	}

	public double getCont() {
		return cont;
	}

	public void setCont(double cont) {
		this.cont = cont;
	}
	
	
	

}
