package com.java.assign;

public class Add2DArray {

	public static void main(String[] args) {
		
		int x[][] = { { 20, 10, 2 }, { 2, 4, 5 }, { 3, 7, 1 } };
		int y[][] = { { 21, 21, 7 }, { 1, 7, 25 }, { 23, 13, 65 } };
		
		add2DArray(x, y);
		

	}
	
	//24. Adding 2 dimensional arrays
	
	public static void add2DArray(int arr1[][],int arr2[][]) {
		
		int[][] arr3=new int[arr1.length][arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
				arr3[i][j]=arr1[i][j]*arr2[i][j];
				
				System.out.println(arr3[i][j]);
				
			}
			System.out.println();
		}
		
	}


}
