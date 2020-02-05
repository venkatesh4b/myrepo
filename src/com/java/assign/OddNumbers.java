package com.java.assign;

public class OddNumbers {

	public static void main(String[] args) {
		
		
		oddNumbers(0,100);

	}
	
	// 3.print odd numbers between given range
	
	public static void oddNumbers(int rStart, int rEnd) {
		
		for (int i = rStart; i <rEnd; i++) {
			
			if(i%2==1) {
				
				System.out.print(i + "  ");
			}
			
		}
		

		System.out.println();
		
	}

}
