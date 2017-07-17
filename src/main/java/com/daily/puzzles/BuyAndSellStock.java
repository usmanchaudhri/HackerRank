package com.daily.puzzles;

import java.util.ArrayList;

class Interval {
	int buy, sell;
}

public class BuyAndSellStock {
	
	public static void main(String[] args) {
		BuyAndSellStock stock = new BuyAndSellStock();		
		int price[] = {100, 200, 300, 400, 500, 600, 700};
		int n = price.length;
//		stock.stockBuySell(price, n);				
		char[] ch = "asdf".toCharArray();
		
	}
	
	private void stockBuySell(int[] price, int n) {
		// prices should be given for atleast two days
		if(n == 1) {
			return;
		}
		
		int count = 0;		
		ArrayList<Interval> sol = new ArrayList<Interval>();
		int i=0;
		while(i < n-1) {
			// find local Minima. Note that the limit is (n-2) 
			// as we are comparing present element to the next
			// element
			while( (i < n-1) && (price[i+1] <= price[i]) ) {
				i++;
			}
			
			// if we reach the end break and no solution is possible
			if(i == n-1) {
				break;
			}
			
			Interval e = new Interval();
			e.buy = i++;
			// store the index of minima
			
			// find local maxima. Note that the limit is (n-1) 
			// as we are comparing to previous element
			while( (i < n) && (price[i] >= price[i -1]) ) {
				i++;
			}
			
			// store the index of maxima.
			e.sell = i-1;
			sol.add(e);
			
			// Increment number of buy/sell
			count++;
		}		
	}
	
}
