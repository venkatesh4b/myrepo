package com.java.basics;

public class C17VerifyDataStandard_Pan {

	public static void main(String[] args) {
		
		String pan = "ABCDE1234Z";
		
		if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
			System.out.println("correct pan number");
		}else {
			System.out.println("wrong pan number");
		}

	}

}
