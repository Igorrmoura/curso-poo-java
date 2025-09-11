package entities;

public class ImportedProduct extends Productss {

	private Double CustomsFree;

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		CustomsFree = customsFree;
	}

	public Double getCustomsFree() {
		return CustomsFree;
	}

	public void setCustomsFree(Double customsFree) {
		CustomsFree = customsFree;
	}

	public void TotalValue(Double TotalValue) {
		TotalValue += TotalValue;
	}

	@Override
	public String TagPrice() {
		return getName() + " $ " + String.format("%.2f", TagPrice()) + " (Customs fee: $ "
				+ String.format("%.2f", CustomsFree) + ")";
	}

}
