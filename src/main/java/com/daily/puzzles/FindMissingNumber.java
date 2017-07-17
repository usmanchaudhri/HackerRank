package com.daily.puzzles;

public class FindMissingNumber {

	int[] numbers = new int[100];
	
	public static void main(String[] args) {
		FindMissingNumber n = new FindMissingNumber();
		int a[] = {100,102,103,105,106,107};
		System.out.println("missing number" + n.missingNumber(a, 5));
	}
	
	public int missingNumber(int[] a, int n) {
		int i, total, range;
		total = (n+1)*(n+2)/2;
		for(i=0; i<n; i++) {
			total = total - a[i];
		}
		return total;
	}
	
}
