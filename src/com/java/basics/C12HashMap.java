package com.java.basics;

import java.util.ArrayList;
import java.util.HashMap;

public class C12HashMap {

	public static void main(String[] args) {
		String userDetails[] = new String[2];
		userDetails[0] = "selenium";
		userDetails[1] = "asdasd";

		ArrayList<Object> userData = new ArrayList<>();
		userData.add("asdf");
		userData.add("selenium");
		
		
		HashMap<String, Object> userDataMap = new HashMap<>();
		userDataMap.put("password", "asdf");
		userDataMap.put("username", "selenium");
		userDataMap.put("environment", "test");
		
		System.out.println(userData.get(0));
		System.out.println(userDataMap.get("username"));

	}

}
