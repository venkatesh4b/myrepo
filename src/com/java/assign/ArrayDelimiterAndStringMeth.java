package com.java.assign;

public class ArrayDelimiterAndStringMeth {

	public static void main(String[] args) {
		
		//arrayDelimiter("Selenium webdriver and java ");
		//wordsInSting("Selenium and java with cucumber");
		
		reverseWords("selenium webdriver2.0");

	}
	
	public static void arrayDelimiter(String str) {
		
		String[] strsplit = str.split("");
		for (int i = 0; i < strsplit.length; i++) {
			
			System.out.println("Split"+ (i+1) +":"+ strsplit[i]);
			
		}
		
	}
	
	public static void wordsInSting(String str) {
		
		String[] strsplit = str.split(" ");
		
		System.out.println("Number of words in a given string are " + strsplit.length);
		
	}
	
	public static void reverseWords(String str) {
		
		String[] strsplit = str.split(" ");
		for (int i = strsplit.length-1;i >=0; i--) {
			String rev=" ";
			
			rev=rev+strsplit[i];
			
			System.out.println(rev+" ");
			
		}
		
		
	}
	
	
	
	
	

}
