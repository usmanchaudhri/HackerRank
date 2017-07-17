package com.matrix.manipulation;

public class MatrixRotateAndFlip {

	private char[] grid = {'1','2','3','4','5','6','7','8','9','0',
			'q','w','e','r','t','y','u','i','o','p',
			'a','s','d','f','g','h','j','k','l',';',
			'z','x','c','v','b','n','m',',','.','/'};
	
	
	private int rows = 4;
	private int cols = 10;			
	private int[] wordPosition = new int[40];		// this will store the index positions of each characters, so, we can reconstruct the word later

	public static void main(String[] args) {
		MatrixRotateAndFlip mat = new MatrixRotateAndFlip();
		mat.flipH();
		
		System.out.println(" ");
	}
	
	public void flipV() {
		int row=0;
		int col=0;
		for(int i=1; i<=grid.length; i++) {			
			int offset = col*rows;
			row = i%10;
			if((row) > 10) {
				swap(offset+col-1, offset-col+cols);
			} else {
				col++;
			}
		}
	}
	
	// flip all rows
	// array[width * row + col] = value;  
	// we have to dynamically calculate the index of the array
	public void flipH() {
		int row = 0; 
		int col = 0;
		for(int i=1; i<=grid.length; i++) {			
			int offset = row*cols;
			col = i/10;
			if((col) > 0) {
				swap(offset+col-1, offset-col+cols);
			} else {
				row++;	// reset the row counter
			}
		}

		System.out.println("");
		
//		for(int row=0; row<rows; row++) {
//			for(int col=0; col<cols/2; col++) {
//				int offset = row*cols;
//				char element = grid[offset+col];
//				swap(offset+col, offset-col+cols);
//			}
//			System.out.println("printed");
//		}		
	}
	
	public void shift(int key) {
		reverse(0, key);
		reverse(key, grid.length);
		reverse(0, grid.length);		
	}
	
	public void reverse(int start, int end) {
		int length = (start+end)/2;
		for(int i=0; i<length; i++) {
			swap(i, length-i);
		}
	}
	
	public void swap(int i, int j) {
		char temp = grid[i];
		grid[i] = grid[j];
		grid[j] = temp;
	}
	
}
