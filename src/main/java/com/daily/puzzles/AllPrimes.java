package com.daily.puzzles;

public class AllPrimes {

	public static void main(String[] args) {
//		AllPrimes primes = new AllPrimes();
//		if(primes.isPrime(4)) {
//			System.out.println("is prime");
//		} else {
//			System.out.println("is not prime");
//		}		
//		primes.isPrime2(25);
		
		String str = "123";
		char[] ch = str.toCharArray();
		int size = ch.length;
		int mul = 1;
		int value = 0;
		for(int i=size-1; i>=0; i--, mul=mul*10) {
			int temp = ch[i] - '0'; 
			int result = temp * mul;
			value = value+result;
		}
		
		System.out.println(value);		
	}
	
	// print all prime numbers smaller than or equal to n
	public boolean isPrime(int n) {
		// primes are divisible by it-self or 1		
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPrime2(int n) {
		for(int i=2; 2*i<n; i++) {
			if(n%i == 0) {
				return false;
			}			
		}
		return true;
	}
	
	// we can start dividing by numbers starting at the begin and end
	public boolean isPrime3(int n) {
		// check if n is a multiple of 2
		if(n%2 == 0) return false;
		
		// if not, then just check the odds
		for(int i=3; i*i<=n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
