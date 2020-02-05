package com.java.basics;

import java.util.ArrayList;
import java.util.HashSet;

public class C11Set {

	public static void main(String[] args) {
		
		ArrayList<String> userIds1 = new ArrayList<>();
		userIds1.add("10");
		userIds1.add("30");
		userIds1.add("10");
		System.out.println("The size of list is "+ userIds1.size());
		
		System.out.println(userIds1.get(0));
		HashSet<String> userIds = new HashSet<>();
		userIds.add("10");
		userIds.add("30");
		userIds.add("10");
		System.out.println("The size of set is "+userIds.size());
		for(String userId: userIds) {
			System.out.println(userId);
		}
		

	}

}
