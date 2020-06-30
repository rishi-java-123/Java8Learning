package com.cleancode.learning;

public abstract class Employee {

	public  boolean isPayday() {
		int lastDateOfCurrentMonth = Utility.getLastDateOfCurrentMonth();
		boolean result = lastDateOfCurrentMonth==30||lastDateOfCurrentMonth==31?true:false;
		return result;
	}

	public abstract Money calculatePay();

	public abstract void deliverPay(Money pay);

}
