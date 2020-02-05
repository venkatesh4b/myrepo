package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C18WorkingWithStrings_RegExp_Search {

	public static void main(String[] args) {
	
		String strExpected = ".e";
		String strActual = "Welcome.e to Selenium Training";

		Pattern p = Pattern.compile(strExpected);

		Matcher matches = p.matcher(strActual);
		
		int c=0;
		while(matches.find()) {
			System.out.println(matches.group(0));
			c++;
		}
		System.out.println(c+" times found");
	}

}
