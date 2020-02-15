package com.java.assign;

public class StringReverse {

	public static void main(String[] args) {
		
		stringReverse("venkatesh");

	}
	
	public static void stringReverse(String txt) {
		
		for (int i = txt.length()-1; i >=0; i--) {
			
			String rev="";
			rev=rev+txt.charAt(i);
			System.out.println(rev+ "");
			
		}
		
		
		
		
		
	}

}
