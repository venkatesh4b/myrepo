package com.java.basics;

import java.util.regex.Pattern;

public class C17WorkingWithStrings_RegExp {

	public static void main(String[] args) {
	
		String strActual = "abcde1234z";
		
		//[a-z]{5}[0-9]{4}[a-z]
		
		//abcde1234z
		//abcde1234
		//bcde1234za
	
		
		if(Pattern.matches("[a-z]{5}[0-9]{4}[a-z]", strActual)) {
			System.out.println("correct pan number");
		}else {
			System.out.println("wrong pan number");
		}

	}

}
