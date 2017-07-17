package com.daily.puzzles;

// sort a given grid G lexicographically
public class GridChallenge {
	
	public char[][] g = {{'a', 'd', 'r', 'r', 'd'}, 
						 {'e', 'q', 'z', 'g', 'h'},
						 {'a', 'd', 'r', 'r', 'd'}};

	public static void main(String[] args) {
		GridChallenge grid =  new GridChallenge();
		grid.sort();				
		System.out.println("print");		
	}	
	
	public void sort() {				
		for(int i=0; i<g.length; i++) {
			int width = g[i].length;
			for(int j=0; j<width; j++) {				
				if(g[i][j] > g[i][width-1]) {
					char temp = g[i][j];
					g[i][j] = g[i][width-1];
					g[i][width-1] = temp;						
				}		
			}			
		}				
	}	
	
}
