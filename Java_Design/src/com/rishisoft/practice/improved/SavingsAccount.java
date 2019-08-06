package com.rishisoft.practice.improved;

public class SavingsAccount implements BankAccount, Comparable<BankAccount> {
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
		return "Savings account " + acctnum + ": balance=" + balance + ", is " + (isforeign ? "foreign" : "domestic");
	}

	public void addInterest() {
		balance += (int) (balance * rate);
	}

	@Override
	public int compareTo(BankAccount ba) {
		int bal1 = getBalance();
		int bal2 = ba.getBalance();
		if (bal1 == bal2)
			return getAcctNum() - ba.getAcctNum();
		else
			return bal1 - bal2;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SavingsAccount))
			return false;
		SavingsAccount ba = (SavingsAccount) obj;
		return getAcctNum() == ba.getAcctNum();
	}
}
