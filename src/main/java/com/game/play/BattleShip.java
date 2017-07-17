package com.game.play;

public class BattleShip {
	
	public final static int EMPTY = 0;
	public final static int EMPTY_HIT = 1;
	public final static int OCCUPIED = 2;
	public final static int OCCUPIED_HIT = 3;
	
	public static void main(String[] args) {				
		int[][] board = new int[10][10];
		BattleShip battleShip = new BattleShip();		
		battleShip.populateBoard(board, 2, 3);
		battleShip.populateBoard(board, 3, 4);
		battleShip.populateBoard(board, 6, 8);
		
		boolean won = false;
		do {
	        System.out.println("Fire to a position:");
	        String attemptString = "1,2";		// read line here to get the position where to fire at

	        String[] splitAttemptString = attemptString.split(",");

	        int attemptX = Integer.parseInt(splitAttemptString[0]);
	        int attemptY = Integer.parseInt(splitAttemptString[1]);
			boolean fi = battleShip.fireAt(board, attemptX, attemptY);
			if(fi) {
				System.out.println("Successful hit!");
			} else {
				System.out.println("Unsuccessful hit!");
			}
			
            System.out.println("Board state:");
            String[][] sboard = boardState(board);
			
            // parse the board to check if ship is still occupying the
            // board. You will win the game is all ships are destroyed
            boolean occupied = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == OCCUPIED) {
                        occupied = true;
                    }
                }
            }
            
            if(! occupied) {
            	won = true;
            }
            
		} while(!won);	
		
		System.out.println("Congratulations! you have won the game.");
	}
	
	public static String[][] boardState(int[][] board) {
		String[][] bo = new String[10][10];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j] == EMPTY_HIT) {
					bo[i][j] = "X";
				} else if(board[i][j] == OCCUPIED_HIT) {
					bo[i][j] = "0";
				} else {
					bo[i][j] = "-";
				}
			}
		}
		return bo;
	}
	
	// place ship on the board
	// this method can take ship type and place each ship with a different type
	public void populateBoard(int[][] board, int row, int size) {
		for(int i=0; i<size; i++) {
			board[row][i] = OCCUPIED;
		}		
	}
	
	public boolean fireAt(int[][] board, int x, int y) {
		if(board[x][y] == OCCUPIED) {
			board[x][y] = OCCUPIED_HIT;
			return true;
		}
		
		board[x][y] = EMPTY_HIT;
		return false;
	}
	
	
}
