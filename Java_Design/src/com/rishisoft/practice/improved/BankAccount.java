package com.rishisoft.practice.improved;

public interface BankAccount extends Comparable<BankAccount> {
	public abstract int getAcctNum();

	public abstract int getBalance();

	public abstract boolean isForeign();

	public abstract void setForeign(boolean isforeign);

	public abstract void deposit(int amt);

	public abstract boolean hasEnoughCollateral(int loanamt);

	public abstract String toString();

	void addInterest();

	static BankAccount createSavingsWithDeposit(int acctnum, int n) {
		BankAccount ba = new SavingsAccount(acctnum);
		ba.deposit(n);
		return ba;
	}

	default boolean isEmpty() {
		return getBalance() == 0;
	}
}
