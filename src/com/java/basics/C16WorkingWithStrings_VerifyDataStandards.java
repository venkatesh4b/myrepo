package com.java.basics;

public class C16WorkingWithStrings_VerifyDataStandards {

	public static void main(String[] args) {
		
		String strActual = "abcde1234z";
		
		//[a-z]{5}[0-9]{4}[a-z]
		
		//abcde1234z
		//abcde1234
		//bcde1234za
	
		if(strActual.matches("[a-z]{5}[0-9]{4}[a-z]")) {
			System.out.println("correct pan number");
		}else {
			System.out.println("wrong pan number");
		}
		
		String strTime = "12:12:12";
		//00-24		
		//([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])
		//24:00:00
		//23:00:00
		//14:56:12
	}

}





