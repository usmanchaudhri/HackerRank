package com.mars.rover.execise;

/**
 * Represents a Mars Rover with it's current position stored in (x, y) and direction. 
 **/
public class Rover {
	int x;
	int y;
	char direction;
	public Rover(int x, int y, char direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	// prints the current location of the rover along with it's direction
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(x).append(" ").append(y).append(" ").append(direction);
		return builder.toString();
	}
	
}
