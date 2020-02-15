package com.java.basics;

import java.util.ArrayList;

public class C10ArrayList {

	public static void main(String[] args) {
		String userDetails[] = new String[2];
		userDetails[0] = "selenium";
		userDetails[1] = "asdasd";

		ArrayList<Integer> lstNumbers = new ArrayList();
		lstNumbers.add(10);
		lstNumbers.add(20);
		lstNumbers.add(3);
		lstNumbers.add(40);
		lstNumbers.add(0, 100);
		lstNumbers.add(0, 100);
		lstNumbers.add(0, 100);
		lstNumbers.add(0, 100);
		lstNumbers.add(0, 200);

		System.out.println(lstNumbers.get(0));
		System.out.println(lstNumbers.get(1));
		System.out.println(lstNumbers.get(2));

		// Find Prime Numbers between range and add to list
		/// which is divisible by only one and itself

		ArrayList<Integer> oddNumbers = new ArrayList<>();

		for (int n = 1; n <= 100; n++) {

			//int n = 99;

			boolean isPrime = true;
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(n + " is prime number");
				oddNumbers.add(n);
			}
		}
	}

}
