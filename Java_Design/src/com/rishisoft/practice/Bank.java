package com.rishisoft.practice;

import java.util.HashMap;

public class Bank {
	private HashMap<Integer,BankAccount> accountDetails;
	   private int nextAccount;

	   public Bank(HashMap<Integer,BankAccount> accounts, int n) {
	      this.accountDetails = accounts;
	      nextAccount = n;
	   }

	public int newAccount(boolean isForeign) {
		int accountNumber = nextAccount++;
		BankAccount ba = new BankAccount(accountNumber);
		ba.setForeign(isForeign);
		accountDetails.put(accountNumber, ba);
		return accountNumber;
	}

	public void deposit(int accountNumber, int amount) {
		BankAccount ba = accountDetails.get(accountNumber);
	      ba.deposit(amount);

	}

	public int getBalance(int accountNumber) {
		BankAccount ba = accountDetails.get(accountNumber);
		return ba.getBalance();
	}

	public String toString() {
	      String result = "The bank has " + accountDetails.size() + " accounts.";
	      for (BankAccount ba : accountDetails.values())
	         result += "\n\t" + ba.toString();
	      return result;
	   }

	public void setForeign(int acctnum, boolean isforeign) {
		BankAccount ba = accountDetails.get(acctnum);
		ba.setForeign(isforeign);
	}

	public void addInterest() {
		for (BankAccount ba : accountDetails.values()) {
			ba.addInterest();
		}
	}

	public boolean authorizeLoan(int accountNumber, int loanAmount) {
		BankAccount bankAccount = accountDetails.get(accountNumber);
		
		return bankAccount.hasEnoughCollateral(loanAmount);
	}

}
