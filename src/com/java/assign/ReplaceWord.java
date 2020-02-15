package com.java.assign;

public class ReplaceWord {

	public static void main(String[] args) {
		
		replaceWord("Selenium is one of the popular testing tool");

	}
	
	public static void replaceWord(String str) {
		
		String rw = str.replaceAll("testing", "Automation Testing");
		System.out.println(rw);
	}

}
