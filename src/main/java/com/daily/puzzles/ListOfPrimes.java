package com.daily.puzzles;

import java.util.Arrays;

// the int array hold true for all prime numbers
// use process of elimination to remove non-prime numbers from the int array.
public class ListOfPrimes {

	boolean[] primes = new boolean[1000];
	
	public static void main(String[] args) {
		ListOfPrimes p = new ListOfPrimes();
		p.fillArray();		
	}
	
	private void fillArray() {
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false; 		
		for(int i=2; i<primes.length; i++) {			
			if(isPrime(i)) {
				for(int j=2; i*j<primes.length; j++) {
					primes[i*j] = false;
				}
			}
		}	
		
		System.out.println("All prime numbers");
		for(int i=0; i<primes.length; i++) {
			if(primes[i] == true) {
				System.out.println("prime " + i);
			}
		} 
	
	}
	
	public boolean isPrime(int n) {
		return primes[n];
	}
	
}
