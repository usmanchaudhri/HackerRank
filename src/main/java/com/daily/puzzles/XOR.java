package com.daily.puzzles;

public class XOR {

	public static void main(String[] args) {
		XOR xor = new XOR();
		int max = xor.maxXor(10, 15);
		System.out.println(max);
	}	
	
	public int maxXor(int l, int r) {
		int max = 0;
		for(int i=l; i<=r; i++) {
			for(int j=l; j<=r; j++) {
				if((i^j) > max) {
					max = i^j;
				}
			}
		}				
		return max;
	}
	
}
