package com.rishisoft.practice;

import java.util.Scanner;

public class BankClient {
	private int current = 0;
	private Scanner scanner;
	private boolean done = false;
	private Bank bank = new Bank();
	
	 public void run() {
	      scanner = new Scanner(System.in);
	      while (!done) {
	         System.out.print("Enter command (0=quit, 1=new, 2=select, 3=deposit, 4=loan, 5=show, 6=interest): ");
	         int cnum = scanner.nextInt();
	         processCommand(cnum);
	      }
	      scanner.close();
	   }

	   private void processCommand(int cnum) {
	      if      (cnum == 0) quit();
	      else if (cnum == 1) newAccount();
	      else if (cnum == 2) select();
	      else if (cnum == 3) deposit();
	      else if (cnum == 4) authorizeLoan();
	      else if (cnum == 5) showAll();
	      else if (cnum == 6) addInterest();
	      else
	         System.out.println("illegal command");
	   }

	   private void quit() {  
	      done = true;
	      System.out.println("Goodbye!");
	   }
	   
	   private void newAccount(){
		   current = bank.newAccount();
		   System.out.println("The new account number is"+current);
	   }
	   
	   private void select(){
		   System.out.print("Enter account#: ");
		  current = scanner.nextInt();
		   int balance = bank.getBalance(current);
		   System.out.println("The balance of account " + current + " is " + balance);
	   }
	   
	   private void deposit(){
		   System.out.println("Enter amount to deposit :");
		   int amountToDeposite = scanner.nextInt();
		   bank.deposit(current, amountToDeposite);
	   }
	   
	   private void authorizeLoan(){
		   System.out.println("Enter the amount for loan:");
		   int loanAmount = scanner.nextInt();
		   boolean authorizeLoan = bank.authorizeLoan(current, loanAmount);
		   if(authorizeLoan){
			   System.out.println("Your loan is approved");
		   }
		   System.out.println("your loan is denied");
	   }
	   
	   private void showAll(){
		   bank.toString();
	   }
	   
	   private void addInterest(){
		   bank.addInterest();
	   }
}
