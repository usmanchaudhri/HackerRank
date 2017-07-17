package com.daily.puzzles;

public class PerfectSquares {
	
	public static void main(String[] args) {
		PerfectSquares sq = new PerfectSquares();
		sq.findPerfectSquare(9, 25);
	
	}
	
	public void findPerfectSquare(int a, int b) {		
		double bSqrt = Math.floor(Math.sqrt(b));
		double aSqrt = Math.ceil(Math.sqrt(a));		
		double result = (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;

		System.out.println(bSqrt);
		System.out.println(aSqrt);
		System.out.println(result);
	}
	
}
