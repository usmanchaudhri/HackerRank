package com.daily.puzzles;

import java.util.Stack;

public class CalculatorWithStack {

	public static void main(String[] args) {
		CalculatorWithStack calc = new CalculatorWithStack();
		String input = "1+3+5+8/4";
		char[] ch = input.toCharArray();		
		int ans = calc.resolve(ch);
		
		System.out.println(ans);
	}
	
	public int resolve(char[] exp) {
		Stack<Integer> operands = new Stack<Integer>();
		Stack<Character> operator = new Stack<Character>();
		
		for(int i=0; i<exp.length; i++) {
			if(exp[i] >= '0' && exp[i] <= '9') {
				operands.push(Integer.parseInt(String.valueOf(exp[i])));
			} else if(exp[i] == '+' || exp[i] == '-' ||
					  exp[i] == '*' || exp[i] == '/') {
				
				while(!operator.isEmpty() && hasPrecedence(exp[i], operator.peek())) {
					int res = applyOp(operator.pop(), operands.pop(), operands.pop());
					operands.push(res);
				}				
				operator.push(exp[i]);
			} 												
		}
		
		// entire expression has been parsed at this point, apply remaining 
		// ops to remaining values
		while(!operator.isEmpty()) {
			int res = applyOp(operator.pop(), operands.pop(), operands.pop());
			operands.push(res);
		}
		
		return operands.pop();
		// par the expression and separate our operators
	}	

	// return true if 'op2' has higher or same precedence as 'op1'
	// otherwise return false
	public boolean hasPrecedence(char op1, char op2) {
		if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
			return false;
		}		
		return true;
	}
	
	public int applyOp(char op, int b, int a) {		
		switch(op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '/':
			return a/b;
		case '*':
			return a*b;
		}
		return 0;
	}
	
	
}
