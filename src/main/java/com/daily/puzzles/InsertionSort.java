package com.daily.puzzles;

public class InsertionSort {
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int[] ch = {11, 15, 13, 12, 10};
		sort.sort(ch);
		
		System.out.println("");
	}

	public void sort(int[] arr) {
		int n = arr.length; 
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}			
			arr[j+1] = key;
		}				
	}	
	
}
