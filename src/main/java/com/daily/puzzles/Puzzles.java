package com.daily.puzzles;

public class Puzzles {
	
	public static void main(String[] args) {
		Puzzles puzzles = new Puzzles();
		puzzles.trueOrFalse();		
	}
	
	public void trueOrFalse() {
		boolean a = true;
		boolean b = !a;
		
		boolean result = false || true ? true : false;
		
		
		if(false && true) {
			System.out.println("true");			
		} else {
			System.out.println("false");			
		}
		
		if((a && b) || (a && b)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
}
