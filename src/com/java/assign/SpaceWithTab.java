package com.java.assign;

public class SpaceWithTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		spaceWithTab("software testing help");

	}
	
	public static void spaceWithTab(String str) {
		
		String x = str.replaceAll(" ", "/t");
		
		System.out.println(x);
		
	}

}
