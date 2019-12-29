package java8.functional.interfaces.framework;

public class TestReceiptPrinting {

	public static void main(String[] args) {
		
		
		ReceiptPrinter simReceiptPrinter = new ReceiptPrinter() {

			@Override
			public void print(Receipt receipt) {
				System.out.println("\nItem :\t" + receipt.item);
				System.out.println("Price:\t" + receipt.price);
				System.out.println("Disc:\t" + receipt.discount);
				System.out.println("Tax:\t" + receipt.tax);
				System.out.println("Total:\t" + computeTotal(receipt));

			}
		};

		ReceiptPrinter exmptedReceiptPrinter = new ReceiptPrinter() {

			@Override
			public void print(Receipt receipt) {
				System.out.println("\nItem :\t" + receipt.item);
				System.out.println("Price:\t" + receipt.price);
				System.out.println("Disc:\t" + receipt.discount);
				System.out.println("Total:\t" + computeTotal(receipt));

			}

			@Override
			public double computeTotal(Receipt receipt) {

				return receipt.price - (receipt.price * receipt.discount);
			}

		};
		
		Receipt receipt = new Receipt(20.00, "shirt", 0.05, 0.07);
		simReceiptPrinter.print(receipt);
		exmptedReceiptPrinter.print(receipt);

	}

	
	
	

}
