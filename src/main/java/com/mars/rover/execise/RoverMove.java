package com.mars.rover.execise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * possible directions N, S, E, W
 **/
public class RoverMove {
	
	int length, width;
	String filename =  null;	
	List<Character> compass = new ArrayList<Character>(Arrays.asList('N', 'E', 'S', 'W'));
	
	enum DIRECTION {
		NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');		
		private final char code;
		private DIRECTION(char code) {
			this.code = code;
		}		
		public char getCode() {
			return this.code;
		}		
	}	
	
	enum MOVEMENTS {
		STEP('M'), ROTATELEFT('L'), ROTATERIGHT('R');		
		private final char code;
		private MOVEMENTS(char code) {
			this.code = code;
		}				
		public char getCode() {
			return this.code;
		}
	}
	
	// 
	public RoverMove(int length, int width) {
		this.length = length;
		this.width = width;
	}	
	
	public RoverMove(String filename) {		
		this.filename = filename;
	}

	public void init(int x, int y, char direction) {
		Rover rover = new Rover(x, y, direction);		
	}

	public static void main(String[] args) {
		Rover rover = new Rover(3, 3, 'E');		
		String input = "MMRMMRMRRM";		
		RoverMove roverMove = new RoverMove(5, 5);
		roverMove.navigate(input.toCharArray(), rover);		
		System.out.println(rover.toString());
	}
	
	/**
	 * rotates or moves the rover based on the given instruction set 
	 * 
	 * @param inputs	- the instruction set for moving the mars rover
	 * @param rover 	- the rover currently operated on
	 * 
	 **/
	public void navigate(char[] inputs, Rover rover) {	
		for(char input : inputs) {		
			if(input == MOVEMENTS.STEP.getCode()) {	
				step(rover);				
			} else if(input == MOVEMENTS.ROTATELEFT.getCode() || input == MOVEMENTS.ROTATERIGHT.getCode()) {
				rotate(input, rover);
			} else {
				// TODO - log invalid input 
				System.out.println("Invalid input");
			}
		}				
	}
	
	/**
	 * moves the rover forward ONE step in whichever direction the rover is currently facing.
	 * 
	 * @param rover 	- the rover currently operated on
	 **/
	public void step(Rover rover) {
		if(rover.direction == DIRECTION.NORTH.getCode() && rover.y < this.width) {
			rover.y = rover.y+1;
		} else if(rover.direction == DIRECTION.SOUTH.getCode() && rover.y > 0) {
			rover.y = rover.y-1;
		} else if(rover.direction == DIRECTION.EAST.getCode() && rover.x < this.length) {
			rover.x = rover.x + 1;
		} else if(rover.direction == DIRECTION.WEST.getCode() && rover.x > 0) {
			rover.x = rover.x - 1;
		}				
	}	
	
	/**
	 * rotates the rover 90 degrees in either N, E, S, W direction.
	 * 
	 * @param input		- the instruction which direction to rotate the rover.
	 * @param rover		- the Mars rover object.
	 **/
	public void rotate(char input, Rover rover) {
		char roverDirection = rover.direction;
		int compassIndex = compass.indexOf(roverDirection);		
		
		if(input == MOVEMENTS.ROTATELEFT.getCode()) {
			if((compassIndex-1) < 0) {
				compassIndex = compass.size();
			}
			compassIndex--;				
		} else if(input == MOVEMENTS.ROTATERIGHT.getCode()) {
			if((compassIndex+1) > compass.size()-1) {
				compassIndex = -1;
			}
			compassIndex++;
		}
		
		// set current direction of rover
		rover.direction = compass.get(compassIndex);
	}	
	
	public void init() {
		BufferedReader reader = null;
		Map<String, String> data = new HashMap<String, String>();
		try {			
			reader = new BufferedReader(new FileReader(this.filename));
			String line = null;
			String grid = reader.readLine();
			grid = grid.replaceAll("\\s+", "");
				
			// set grid length and width
			char[] gridData = grid.toCharArray();
			this.length = gridData[0];
			this.width =  gridData[1];			
			while((line = reader.readLine()) != null) {
				String roverPos = line.replaceAll("\\s+", "");				
				String roverInstructions = reader.readLine().replaceAll("\\s+", "");				
				data.put(roverPos, roverInstructions);				
			}
		
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} 
		
	}
		
}
