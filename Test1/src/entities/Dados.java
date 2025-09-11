package entities;

public class Dados {
	
	private String name;
	private double conta;
	private double gasto;
	
	public Dados(String name, double conta, double gasto) {
		super();
		this.name = name;
		this.conta = conta;
		this.gasto = gasto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getConta() {
		return conta;
	}


	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}
	
	public void addconta(double conta) {
		conta += conta;
	}

}
