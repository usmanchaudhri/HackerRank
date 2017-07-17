package com.daily.puzzles;

public class SuperReducedString {

	public static void main(String[] args) {
		SuperReducedString reduced = new SuperReducedString();
		String result = reduced.reduced_string("aaabccddd");		
//		String result = reduced.reduced_string("aaabccddd");		
//		String result = reduced.reduced_string("aa");		
		System.out.println(result);
	}
	
	public String reduced_string(String str) {		
		int i=1;
		while( (i<str.length())) {
			if((str.charAt(i) == str.charAt(i-1))) {
				str = str.substring(0, i-1) + str.substring(i+1);	
				i=0;
			}
			i++;
		}		
		
		if(str.length() == 0) {
			return "Empty String";
		} else {
			return str;
		} 
	}

	
}
