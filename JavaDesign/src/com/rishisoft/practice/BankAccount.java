package com.rishisoft.practice;

public class BankAccount {

	private int accountNum;
	private int balance = 0;
	private boolean foreign;
	
	

	public BankAccount(int accountNum) {
		super();
		this.accountNum = accountNum;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isForeign() {
		return foreign;
	}

	public void setForeign(boolean foreign) {
		this.foreign = foreign;
	}

}
