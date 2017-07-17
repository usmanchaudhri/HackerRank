package com.daily.puzzles;

public class LonelyInteger {
	
	public static void main(String[] args) {		
		int[] values = {1,0,0,3,3};
		LonelyInteger li = new LonelyInteger();
		li.find(values);
				
	}
	
	public void find(int[] value) {		
		int len = value.length;
		int[] res = new int[100];		// initialized for zero
		for(int i=0; i<len; i++) {
			// increment what the index values is
			res[value[i]]++;				
		}		
		
		// now check which index has the value 1
		for(int j=0; j<res.length; j++) {
			if(res[j] == 1) {
				System.out.println(j);
			}
		}		
	}
	
}
