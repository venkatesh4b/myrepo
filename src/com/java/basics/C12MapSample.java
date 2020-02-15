package com.java.basics;

import java.util.ArrayList;
import java.util.HashMap;

public class C12MapSample {

	public static void main(String[] args) {
		
		HashMap<String, Object> userDetails = new HashMap<>();
		userDetails.put("password",123456);
		userDetails.put("username", "selenium");
		
		
		System.out.println(userDetails.get("username"));
		System.out.println(userDetails.get("password"));

		ArrayList<Integer> i = new ArrayList();
		i.add(20);
		i.add(10);
		System.out.println(i.get(0));
	}

}
