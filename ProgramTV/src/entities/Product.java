package entities;

public class Product {
	
	// atributos
	private String name;
	private double price;
	private int quantity;
	
	public Product (String name, double price, int quantity ) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// metodos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public int getQuantity() {
		return quantity;
	}


	public double totalvalueinstock() {
		return price * quantity;
	}
	
	public void addproducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeproducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		 + ", $ "
		 + String.format("%.2f", price)
		 + ", "
		 + quantity
		 + " units, Total: $ "
		 + String.format("%.2f", totalvalueinstock());
	}

}
