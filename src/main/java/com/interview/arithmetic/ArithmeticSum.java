package com.interview.arithmetic;

/**
 * () - * - 
 * 
 * */
public class ArithmeticSum {

	public static void main(String[] args) {
		ArithmeticSum sum = new ArithmeticSum();
		int result = sum.expression(4, 5, 10);
		System.out.println(result);
	}

	// * and % have the same precedence hence we will solve the equation left to right.
	// x*y => z % percent
	public int expression(int x, int y, int percent) {		
		int exp = x * y % percent;
		return exp;
	}
	
}
