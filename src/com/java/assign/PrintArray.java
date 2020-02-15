package com.java.assign;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 //int a[] = { 32, 64, 13, 46, 68 };
		int b[] = { 11, 22, 33, 44 };
		
		printArrays(b);

	}
	
	public static void printArrays(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i] + " ");
			
		}
		
	}

}
