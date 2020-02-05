package com.java.assign;

public class StringToArray {

	public static void main(String[] args) {
		
		string2Array("java string to stringArray", "1234");
		

	}
	
	
	public static void string2Array(String str1, String str2) {
		
		char[] ch = str1.toCharArray();
		
		String[] intsplit = str2.split(" ");
		int n[]=new int[intsplit.length];
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]+ " ");
			
		}
		System.out.println();
		
		for (int i = 0; i < n.length; i++) {
			 n[i]=Integer.parseInt(intsplit[i]);
			 System.out.println(n[i]+ 1234);
			
		}
		
	}

}
