package com.java.assign;

public class AlphaOcuurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 11. Find how many alpha characters present in a string
	
	public static void aplhaOcuurence(String str) {
		
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isLetter(str.charAt(i))) {
				
				count=count+1;
				
			}
			
		}
		
		System.out.println("Aplhabetic occurence are:"+count);
	}

}
