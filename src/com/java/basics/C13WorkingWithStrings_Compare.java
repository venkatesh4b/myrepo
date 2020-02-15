package com.java.basics;

public class C13WorkingWithStrings_Compare {

	public static void main(String[] args) {

		String str1 = "Selenium";
		String str2 = "selenium";

		// method1
		if (str1.equals(str2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are different");
		}
		
		// method2
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are different");
		}

		String str3 = " Selenium ";
		String str4 = "selenium  ";

		// method3 (realtime)
		if (str3.trim().equalsIgnoreCase(str4.trim())) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are different");
		}

		//method4
		if (str1.compareTo(str2)==0) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are different");
		}

		//method5
		if (str1.compareToIgnoreCase(str2)==0) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are different");
		}

	}

}










