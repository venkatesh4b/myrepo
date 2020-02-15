package com.java.basics;

import java.util.ArrayList;

public class C10ListSample {

	public static void main(String[] args) {

		System.out.println(getPrimeNumbersInRange(10, 50));
		
		ArrayList<Integer> pNumbers = getPrimeNumbersInRange(50, 100);
		
/*		ArrayList<Integer> i = new ArrayList();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(10);
		i.add(10);

		System.out.println(i.size());

		for (int x : i) {
			System.out.println(x);
		}

		for (int x = 0; x < i.size(); x++) {
			System.out.println(i.get(x));
		}
*/
	}

	// write a method to get prime numbers between a range
	public static ArrayList<Integer> getPrimeNumbersInRange(int rStart, int rEnd) {

		ArrayList<Integer> arrPrime = new ArrayList<>();
		for (int p = rStart; p <= rEnd; p++) {

			boolean isPrime = true;
			for (int n = 2; n < p / 2; n++) {
				if (p % n == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				arrPrime.add(p);
			}
		}
		return arrPrime;
	}
}







