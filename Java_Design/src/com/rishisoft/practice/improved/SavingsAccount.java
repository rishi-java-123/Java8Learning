package com.rishisoft.practice.improved;

public class SavingsAccount implements BankAccount {
	private double rate = 0.01;
	private int acctnum;
	private int balance = 0;
	private boolean isforeign = false;

	public SavingsAccount(int acctnum) {
		super();
		this.acctnum = acctnum;
	}

	@Override
	public int getAcctNum() {

		return acctnum;
	}

	@Override
	public int getBalance() {

		return balance;
	}

	@Override
	public boolean isForeign() {

		return isforeign;
	}

	@Override
	public void setForeign(boolean b) {
		isforeign = b;

	}

	@Override
	public void deposit(int amt) {
		balance = balance + amt;

	}

	@Override
	public boolean hasEnoughCollateral(int loanamt) {

		return balance >= loanamt / 2;
	}
	
	public String toString() {
	      return "Savings account " + acctnum + ": balance=" + balance 
	            + ", is " + (isforeign ? "foreign" : "domestic");
	   }

	   public void addInterest() {
	      balance += (int) (balance * rate);
	   }

}
