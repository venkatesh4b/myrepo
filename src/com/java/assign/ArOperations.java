package com.java.assign;

public class ArOperations {

	public static void main(String[] args) {
		
		operations(10, 20, "div");

	}
	
	// 8. program to Perform specified Arithmetic Operation on two given numbers
		public static void operations(int x, int y, String operation) {
			switch (operation) {
			case "add":
				System.out.println(x + y);
				break;
			case "sub":
				System.out.println(x - y);
				break;
			case "mul":
				System.out.println(x * y);
				break;
			case "div":
				System.out.println(x / y);
				break;
			default:
				System.out.println("No such operation is there");
				break;
			}
		}

}
