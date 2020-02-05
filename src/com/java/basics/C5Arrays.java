package com.java.basics;

public class C5Arrays {

	public static void main(String[] args) {

		// Datatype[] variableName = new Datatype[NumberOfValues];
		String[] userDetails = new String[3];
		userDetails[0] = "selenium";
		userDetails[1] = "3.7.1";

		System.out.println(userDetails[0]);
		System.out.println(userDetails[1]);
		System.out.println(userDetails[2]);

		int i[] = new int[2];
		i[0] = 10;
		// i[1]=20;
		System.out.println(i[0]);
		System.out.println(i[1]);

		// create array in single line
		int[] x = { 10, 20, 30, 40 };
		System.out.println(x[0]);
		System.out.println(x[1]);

		int m[][] = new int[2][2];

		m[0][0] = 10;
		m[0][1] = 100;
		m[1][0] = 200;
		m[1][1] = 300;

		String usersData[][] = new String[3][2];

		// 1st user data
		usersData[0][0] = "sudhakar";
		usersData[0][1] = "k";

		// 2nd user data
		usersData[1][0] = "selenium";
		usersData[1][1] = "hq";

		// 3rd user data
		usersData[2][0] = "web";
		usersData[2][1] = "driver";


	}

}













