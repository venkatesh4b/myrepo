package com.java.basics;

public class C14WorkingWithStrings_VerifySubStringExist {

	public static void main(String[] args) {
		
		String str = "welcome seleniumnmnm";
		
		//method1
		if(str.contains("selenium")) {
			System.out.println("Substring exist");
		}else {
			System.out.println("substring not exist");
		}

		//method2
		if(str.indexOf("selenium")>=0) {
			System.out.println("Substring exist");
		}else {
			System.out.println("substring not exist");
		}

	}

}
