package com.java.assign;

public class ToUpperAndLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toUpperAndLower("Software Testing Help DOT Com");
		
	}
	
	public static void toUpperAndLower(String str) {
		
		String strLC=str.toLowerCase();
		System.out.println(strLC);
		
		String strUC=str.toUpperCase();
		System.out.println(strUC);
		
		
	}

}
