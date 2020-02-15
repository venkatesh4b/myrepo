package com.java.assign;

public class Factorial {

	public static void main(String[] args) {
		
		factorial(4);

	}
	
	// 4. Factorial of a given number
	
	public static void factorial(int n) {
		
		int i,x=1;
		
		for (i = 1; i <=n; i++) {
			
			x=x*i;
			
		}
		
		System.out.println(x);
		
		
	}

}
