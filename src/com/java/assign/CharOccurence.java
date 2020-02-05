package com.java.assign;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		charOccurence("softwaretestinghelp", 'e');

	}
	
	public static void charOccurence(String str, char c) {
		
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i)==c) {
				
				count=count+1;
				
			}
			
		}
		System.out.println("occurance of '" + c + "' letter in '" + str + "' is: " + count);
		
	}

}
