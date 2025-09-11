package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProducts extends Productss  {
	
	private LocalDate ManufactureDate;

	public UsedProducts(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.ManufactureDate = manufactureDate;
	}

	public String TagPrice() {
		return getName()
		+ " (used) $ " 
		+ String.format("%.2f", getPrice())
		+ " (Manufacture date: "
		+ ManufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		+ ")";
	}

}
