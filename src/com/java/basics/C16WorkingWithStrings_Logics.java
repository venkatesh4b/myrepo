package com.java.basics;

public class C16WorkingWithStrings_Logics {

	public static void main(String[] args) {
		
		String str = "your order number is abcghasfhadfsd1234675. Keep it for future reference";
		
		//print words of string
		String[] arr = str.split(" ");
		for(String st:arr) {
			System.out.println(st);
		}
		
		//Reverse a string
		char[] c = str.toCharArray();
		String x="";
		for(int i=c.length-1;i>=0;i--) {
			x=x+c[i];
		}
		System.out.println(x);
		
		//conver string to uppercase , lowercase
		String str1 = "Hi";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		//replace Strings
		System.out.println(str.replace("er", "ar"));
	}

}












