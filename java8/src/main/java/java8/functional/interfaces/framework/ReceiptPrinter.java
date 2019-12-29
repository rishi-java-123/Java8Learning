package java8.functional.interfaces.framework;

@FunctionalInterface
public interface ReceiptPrinter {

	void print(Receipt receipt);

	static double getDiscountedPrice(Receipt receipt) {
		return receipt.price - (receipt.price * receipt.discount);

	}

	default double computeTotal(Receipt receipt) {
		double discountedPrice = getDiscountedPrice(receipt);
		return discountedPrice + (discountedPrice * receipt.tax);

	}

}
