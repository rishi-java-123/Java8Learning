package com.rishisoft.practice.improved;

import java.util.ArrayList;
import java.util.Collections;

public class ComparingBankAccounts {
	public static void main(String[] args) {
		ArrayList<BankAccount> initializeAccounts = initializeAccounts();
		BankAccount maxSavingAccount = findMax(initializeAccounts);
		BankAccount maxacct2 = Collections.max(initializeAccounts);       
	      System.out.println("Acct with largest balance is " + maxSavingAccount);
	      System.out.println("Acct with largest balance is " + maxacct2);     
	}

	private static ArrayList<BankAccount> initializeAccounts() {

		ArrayList<BankAccount> savingAccounts = new ArrayList<BankAccount>();
		savingAccounts.add(new SavingsAccount(0));
		savingAccounts.get(0).deposit(100);
		savingAccounts.add(new CurrentAccount(1));
		savingAccounts.get(1).deposit(200);
		savingAccounts.add(new SavingsAccount(2));
		savingAccounts.get(2).deposit(500);

		return savingAccounts;
	}

	private static BankAccount findMax(ArrayList<BankAccount> sba) {
		BankAccount max = sba.get(0);
		for (int i = 1; i < sba.size(); i++) {
			if (sba.get(i).compareTo(max) > 0)
				max = sba.get(i);

		}
		return max;
	}
}
