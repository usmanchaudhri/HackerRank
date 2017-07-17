package com.daily.puzzles;

import java.util.Stack;

public class SelfBalancingParanthesis {

	public static void main(String[] args) {
		char exp[] = { '{', '(', ')', '}', '[', ']' };
	}
	
	public boolean areParenthesisBalanced(char[] exp) {		
		Stack<Character> st = new Stack<Character>();		
		for(int i=0; i<exp.length; i++) {				
			// if opening parenthesis
			if(exp[i] == '{' || exp[i] == '[' || exp[i] == '(') {
				st.push(exp[i]);
			}			

			// if closing paranthesis, pop from stack and see if it
			// is a matching pair
			if(exp[i] == '}' || exp[i] == ']' || exp[i] == ')') {
				if(st.isEmpty()) {
					return false;
				} else if(!isMatchingPair(st.pop(), exp[i])) {
					
				}								
			}			
		}		
		return false;
	}
	
	public boolean isMatchingPair(char first, char end) {
		if(first == '(' && end == ')') {
			return true;
		} else if(first == '[' && end == ']') {
			return true;
		} else if(first == '{' && end == '}') {
			return true;
		}		
		return false;
	}
	
	
}
