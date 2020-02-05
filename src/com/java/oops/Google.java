package com.java.oops;

public class Google {
	protected int start=10;
	
	public void Login(String uName, String pwd) {
		System.out.println("Logged in to google with " + uName + " and " + pwd);
	}
	public void logout() {
		System.out.println("logged out of google");
	}
}
