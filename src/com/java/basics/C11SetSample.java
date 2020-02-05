package com.java.basics;

import java.util.HashSet;

public class C11SetSample {

	public static void main(String[] args) {
		
		HashSet<String> uDetails = new HashSet<>();
		uDetails.add("selenium");
		uDetails.add("asdfgh");
		uDetails.add("selenium");
		uDetails.add("selenium");
		
		System.out.println(uDetails.size());
		
		for(String str:uDetails) {
			System.out.println(str);
		}
		
		Object obj[] = uDetails.toArray();
		
		
		
	}

}
