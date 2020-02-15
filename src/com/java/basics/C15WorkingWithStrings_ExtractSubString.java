package com.java.basics;

public class C15WorkingWithStrings_ExtractSubString {

	public static void main(String[] args) {
		
		String str = "your order number is abcghasfhadfsd1234675. Keep it for future reference";
		System.out.println(str.substring(21,29));
		
		System.out.println(str.substring(21,str.indexOf(".")));
		System.out.println(str.substring(21,str.length()-30));
		
	}

}