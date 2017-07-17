package com.daily.puzzles;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagrams {

	public static void main(String[] args) {
		MakeAnagrams ana = new MakeAnagrams();		
		int size = ana.anagramsS("cde", "abc");		
		System.out.println(size);
		
//		System.out.println((('a' - '0') % 26));
//		System.out.println(('b' - '0')  % 26);
//		System.out.println(('c' - '0') % 26);
		
	}
	
	static int anagramsS(String s1, String s2) {
		int[] a = new int[26];		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();		
		for(char ch : ch1) {
			a[(ch-'0') % 26]++;
		}		
		for(char ch : ch2) {
			a[(ch-'0') % 26]--;
		}		
		int count = 0;
		for(int val : a) {
			count += Math.abs(val);
		}				
		return count;
	}
	
}
