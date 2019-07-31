package com.rishisoft.practice;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	private Map<Integer, BankAccount> accountDetails = new HashMap<>();
	private double rate = 0.01;
	private int nextAccount = 1;

	public int newAccount(boolean isForeign) {
		int accountNumber = nextAccount++;
		BankAccount ba = new BankAccount(accountNumber);
		ba.setForeign(isForeign);
		accountDetails.put(accountNumber, ba);
		return accountNumber;
	}

	public void deposit(int accountNumber, int amount) {
		BankAccount ba = accountDetails.get(accountNumber);
		int balance = ba.getBalance();
		ba.setBalance(balance + amount);

	}

	public int getBalance(int accountNumber) {
		BankAccount ba = accountDetails.get(accountNumber);
		return ba.getBalance();
	}

	public String toString() {
	      String result = "The bank has " + accountDetails.size() + " accounts.";
	      for (BankAccount ba : accountDetails.values()) 
	         result += "\n\tAccount " + ba.getAccountNum() + ": balance=" 
	               + ba.getBalance() + ", is "
	               + (ba.isForeign() ? "foreign" : "domestic");
	      return result;
	   }

	public void setForeign(int acctnum, boolean isforeign) {
		BankAccount ba = accountDetails.get(acctnum);
		ba.setForeign(isforeign);
	}

	public void addInterest() {
		for (BankAccount ba : accountDetails.values()) {
			int balance = ba.getBalance();
			balance += (int) (balance * rate);
			ba.setBalance(balance);
		}
	}

	public boolean authorizeLoan(int accountNumber, int loanAmount) {
		BankAccount bankAccount = accountDetails.get(accountNumber);
		int currentBalance = bankAccount.getBalance();
		return currentBalance >= loanAmount / 2;

	}

}
