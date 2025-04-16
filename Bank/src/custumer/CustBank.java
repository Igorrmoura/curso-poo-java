package custumer;

public class CustBank {
	
	private String titular;
	private int number;
	private double balance;
	
	
	public CustBank(String titular, int number) {
		this.titular = titular;
		this.number = number;
	}
	
	
	public CustBank(String titular, int number, double inicialdeposit) {
		super();
		this.titular = titular;
		this.number = number;
		deposit(inicialdeposit);
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumber() {
		return number;
	}


	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}


}
