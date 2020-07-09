package com.cleancode.learning.cohesion;

import java.util.ArrayList;

public class PrimeGenerator {
	
	private static int[] primes;
	private static ArrayList<Integer> multiplesOfPrimeFactors;
	
	public static int[] generatePrimes(int n){
		primes= new int[n];
		multiplesOfPrimeFactors = new ArrayList<Integer>();
		set2AsFirstPrime();
		return primes;
	}

	
	private static void set2AsFirstPrime() {
	       primes[0] = 2;
	       multiplesOfPrimeFactors.add(2);
	}
	
	private static void checkOddNumberForSubsquesntPrimeNumbers(){
		int primeIndex = 1;
		for(int number = 3; primeIndex<primes.length;number=+2) {
			if(isPrime(number)) 
				primes[primeIndex++]=number;
			
		}
	}
	
	public static boolean isPrime(int number) {
		if(isLeastRelevantMultipleOfNextLargerPrimeFactor(number)) {
			multiplesOfPrimeFactors.add(number);
			return false;
		}
			
		return isNotMultipleOfAnyPreviousPrimeFactor(number);
	}
	private static boolean isNotMultipleOfAnyPreviousPrimeFactor(int number) {
		
		for (int n = 1; n < multiplesOfPrimeFactors.size(); n++) {
			if(isMultipleOfNthPrimeFactor(number, n)) {
				return false;
			}
		}
		return true;
	}
	public static boolean isLeastRelevantMultipleOfNextLargerPrimeFactor(int number){
		int nextLargePrimeFactors = primes[multiplesOfPrimeFactors.size()];
		int leastRelevantMultiple = nextLargePrimeFactors * nextLargePrimeFactors;
	       return number == leastRelevantMultiple;
	}

	private static boolean isMultipleOfNthPrimeFactor(int number, int n) {
		return number == smallestOddNthMultipleNotLessThanCandidate(number, n);
	}


	private static int smallestOddNthMultipleNotLessThanCandidate(int number, int n) {
		Integer multiple = multiplesOfPrimeFactors.get(n);
		while (multiple<number) 
			multiple += 2 * primes[n];
			 multiplesOfPrimeFactors.set(n, multiple);
		
		return multiple;
	}


	
}
