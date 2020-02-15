package com.java.assign;

public class SwapNumbers {

	public static void main(String[] args) {
		
		swapNumber(5, 4);

	}
	
	// 7. Swap 2 numbers without a temporary variable
	
	public static void swapNumber(int n1,int n2) {
		
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		
		System.out.println(n1);
		System.out.println(n2);
		
	}

}
