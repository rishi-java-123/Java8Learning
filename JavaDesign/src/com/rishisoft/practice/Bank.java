package com.rishisoft.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank {
	private Map<Integer, Integer> accountDetails = new HashMap<>();
	private double rate = 0.01;
	private int nextAccount=1;

	public int newAccount() {
		int accountNumber = nextAccount++;
		accountDetails.put(0, accountNumber);
		return accountNumber;
	}

	public void deposit(int accountNumber, int amount) {
		int balance = accountDetails.get(accountNumber);
		accountDetails.put(accountNumber, balance + amount);

	}

	public int getBalance(int accountNumber) {
		int currentBalance = accountDetails.get(accountNumber);
		return currentBalance;
	}

	public String toString() {
		Set<Integer> accts = accountDetails.keySet();
		String result = "The bank has " + accts.size() + "accounts.";
		for (int i : accts) {
			result += "\n\tAccount " + i + ": balance=" + accountDetails.get(i);
		}
		return result;

	}

	public void addInterest() {
		Set<Integer> accts = accountDetails.keySet();
		for (int i : accts) {
			int balance = accountDetails.get(i);
			int newBalance = (int) (balance * (1 + rate));
			accountDetails.put(i, newBalance);
		}
	}
	
	public boolean authorizeLoan(int accountNumber, int loanAmount){
		Integer balance = accountDetails.get(accountNumber);
		return balance>= loanAmount/2;
		
	}

}
