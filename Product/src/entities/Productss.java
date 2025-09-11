package entities;

public class Productss {

	private String name;
	private Double price;

	public Productss(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public Double setPrice(Double price) {
		return this.price = price;
	}

	public String TagPrice() {
		return name + " $ " + String.format("%.2f", price);
	}

}
