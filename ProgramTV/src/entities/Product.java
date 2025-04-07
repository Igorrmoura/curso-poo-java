package entities;

public class Product {
	
	// atributos
	public String name;
	public double price;
	public int quantity;
	
	public Product (String name, double price, int quantity ) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// metodos
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
