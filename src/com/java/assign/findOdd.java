package com.java.assign;

import javax.swing.JOptionPane;

public class findOdd {

	public static void main(String[] args) {
		
		System.out.println("");
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
		findOdd(n);
		

	}

	// 2. Given number is odd number or not
	public static void findOdd(int n) {
		
		if (n%2==1) {
			System.out.println(n+ "is a odd number");
			
		}else {
			System.out.println(n+ "is not odd number");
		}
		
	}

}
