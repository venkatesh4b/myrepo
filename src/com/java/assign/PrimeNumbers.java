package com.java.assign;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		primeNumbers(10, 50);

	}
	
	

	// 6. Print Prime numbers between the given range of numbers
	
	public static void primeNumbers(int n1, int n2) {
		
		for (int i = n1; i <=n2; i++) {
			
			int j;
			for (j =2; j<i; j++) {
				
				if (i%j==0) {
					break;
					
				}
				
			}	
			
				if (i==j) {
				
				System.out.println(i+ "");
				
			}
			
		}
		
		
	}

}
