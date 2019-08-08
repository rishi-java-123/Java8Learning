package com.rishisoft.practice.improved;

public class CurrentAccount implements BankAccount,Comparable<BankAccount>{

	private int acctnum;
	   private int balance = 0;
	   private boolean isforeign = false;

	   public CurrentAccount(int acctnum) {
	      this.acctnum = acctnum;
	   }

	   public int getAcctNum() { 
	      return acctnum; 
	   }

	   public int getBalance() { 
	      return balance; 
	   }

	   public boolean isForeign() {
	      return isforeign;
	   }

	   public void setForeign(boolean b) {
	      isforeign = b;
	   }

	   public void deposit(int amt) {
	      balance += amt;
	   }

	   public boolean hasEnoughCollateral(int loanamt) {
	      return balance >= 2 * loanamt / 3;
	   }

	   public String toString() {
	      return "Checking account " + acctnum + ": balance=" + balance 
	            + ", is " + (isforeign ? "foreign" : "domestic");
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

	@Override
	public void addInterest() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean equals(Object obj) {
	      if (! (obj instanceof CurrentAccount))
	         return false;
	      CurrentAccount ba = (CurrentAccount) obj;
	      return getAcctNum() == ba.getAcctNum();
	   }
	}
