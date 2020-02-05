package com.java.basics;

public class C3Convertion {

	public static void main(String[] args) {
		
		byte b=100;
		
		int i=1310; //implicit cast
		System.out.println(i);
		
		byte z = (byte) i; //explicit cast
		System.out.println(z);
		
		
		String strN1 = "10";
		String strN2 = "20";
		System.out.println(strN1+strN2);
		
		int n1 = Integer.parseInt(strN1); //returns integer from string type
		int n2 = Integer.parseInt(strN2);
		System.out.println(n1+n2);
	}

}











