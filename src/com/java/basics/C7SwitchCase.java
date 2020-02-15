package com.java.basics;

public class C7SwitchCase {

	public static void main(String[] args) {
		
		String stCode = "ap";
		
		switch(stCode) {
		case "ap":
			System.out.println("amaravathi");
			//break;
		case "ts":
			System.out.println("hyderabad");
			break;
		case "tn":
			System.out.println("chennai");
			break;
		case "dl":
			System.out.println("delhi");
			break;
		default:
			System.out.println("statecode not found");
		}

	}

}
