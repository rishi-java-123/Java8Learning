package com.rishisoft.practice;

import java.util.HashMap;
import java.util.Scanner;

public class BankApllicationStartup {

	public static void main(String[] args) {
		HashMap<Integer, BankAccount> accounts = new HashMap<>();
		Bank bank = new Bank(accounts, 0);
		Scanner scanner = new Scanner(System.in);
		BankClient client = new BankClient(scanner, bank);
		client.run();
	}

}
