package com.rishisoft.practice;

public class BankAccount {

	private double rate = 0.01;
	private int accountNum;
	private int balance = 0;
	private boolean isforeign = false;

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
		return isforeign;
	}

	public void setForeign(boolean foreign) {
		this.isforeign = foreign;
	}

	public void deposit(int amt) {
		balance += amt;
	}

	public boolean hasEnoughCollateral(int loanamt) {
		return balance >= loanamt / 2;
	}

	public String toString() {
		return "Account " + accountNum + ": balance=" + balance + ", is " + (isforeign ? "foreign" : "domestic");
	}

	public void addInterest() {
		balance += (int) (balance * rate);
	}

}
