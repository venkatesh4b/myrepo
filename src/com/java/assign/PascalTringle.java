package com.java.assign;

public class PascalTringle {

	public static void main(String[] args) {
		
		pascalTringle(5);
	}
	
	public static void pascalTringle(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int val = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(val + " ");
				val = val * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
		
	}

