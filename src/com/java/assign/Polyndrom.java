package com.java.assign;

public class Polyndrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		polyndromString("venkatesh");

	}
	
	public static void polyndromString(String str) {
		
		String poly= "";
		
		for (int i = str.length()-1; i>=0; i--) {
			
			poly=poly+str.charAt(i);
			
			
		}
		System.out.println(poly+ ":");
		
		
		if (str.equals(poly)) {
			System.out.println("Given string is a polyndrom");
			
		} else {
			
			System.out.println("Given string is a polyndrom");

		}
		
		
		
		
		
		
		
		
	}

}
