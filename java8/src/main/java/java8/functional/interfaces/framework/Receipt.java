package java8.functional.interfaces.framework;

public class Receipt {

	double price;
	String item;
	double discount;
	double tax;

	
	public Receipt(double price, String item, double discount, double tax) {
		super();
		this.price = price;
		this.item = item;
		this.discount = discount;
		this.tax = tax;
	}


	public Receipt(Receipt r) {
		price = r.price;
		item = r.item;
		discount = r.discount;
		tax = r.tax;

	}
}
