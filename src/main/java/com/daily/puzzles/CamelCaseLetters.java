package com.daily.puzzles;

public class CamelCaseLetters {
	
	public static void main(String[] args) {
		CamelCaseLetters letters = new CamelCaseLetters();
		letters.findCamelCase("saveChangeInTheEditor");		
	}	
	
	// separate words and than count it
	public void findCamelCase(String s) {
		int capLow = 'A' - 0;
		int capHigh = 'Z' - 0;

		char[] ch = s.toCharArray();
		int wordCount = 1;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] >= capLow && ch[i] <= capHigh) {
				wordCount++;
			}
		}
		System.out.println(wordCount);
	}
	
}
