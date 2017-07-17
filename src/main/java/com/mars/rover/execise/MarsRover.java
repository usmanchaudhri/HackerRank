package com.mars.rover.execise;

import java.util.ArrayList;
import java.util.List;

public class MarsRover {
	
	enum DIRECTION {
		NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');		
		private final char instruction;
		private DIRECTION(char instruction) {
			this.instruction = instruction;
		}		
		public char getInstructionCode() {
			return this.instruction;
		}		
	}	
	
	enum MOVEMENTS {
		STEP('M'), ROTATELEFT('L'), ROTATERIGHT('R');		
		private final char instruction;
		private MOVEMENTS(char instruction) {
			this.instruction = instruction;
		}				
		public char getInstructionCode() {
			return this.instruction;
		}
	}

	
	public static void main(String[] args) {
		if(DIRECTION.NORTH.getInstructionCode() == 'N') {
			System.out.println("North");
		} else if(DIRECTION.SOUTH.getInstructionCode() == 'S') {
			System.out.println("South");
		}
		
		
		
		int[][] grid = new int[10][5];
		List<Character> chlst = new ArrayList<Character>();
		chlst.add('N');
		chlst.add('E');
		chlst.add('S');
		chlst.add('W');

		System.out.println(chlst.indexOf('S'));	
		System.out.println(chlst.indexOf('N'));	
		System.out.println(chlst.indexOf('W'));	
		
		
		char[] direction = {'N', 'E', 'S', 'W'};
		System.out.println("Current Index:" + direction.length);	
		
		int currIndex = 0;
		char key = 'W';
		for(int i=0; i<direction.length; i++) {
			if(key == direction[i]) {
				currIndex = i;
			}
		}		
		System.out.println("Current Index:" + currIndex);	
		
		char input = 'R';
		while(true) {
			if(input == 'L') {
				if((currIndex-1)< 0) {
					currIndex = direction.length;
				}
				currIndex--;				
				break;
			} else if(input == 'R') {
				if((currIndex+1) > direction.length-1) {
					currIndex = -1;
				}
				currIndex++;
				break;
			}
		}
		
		System.out.println("Changed Index:" + currIndex);
	}
		
}
