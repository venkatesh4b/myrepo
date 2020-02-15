package com.java.assign;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assignments {

	public static void main(String[] args) {

		Assignments p = new Assignments();
		// p.printHello(Integer.parseInt(JOptionPane.showInputDialog("Enter a
		// number")));
		// p.findOdd(11);
		// p.oddNumber(0, 100);
		// p.factorial(10);
		// p.findFactor(12);
		// p.primeNumbers(10, 50);
		// p.swapNumber(10, 20);
		// p.operations(10, 6, "mul");
		// p.stringLength(JOptionPane.showInputDialog("Enter a string"));
		// p.stringReverse(JOptionPane.showInputDialog("Enter a string"));
		// p.alphaCharPresent(JOptionPane.showInputDialog("Enter an AlphaNumeric
		// String")); ------->>> didn't get this
		// p.charOccurrence("geethika manasi parella is in 3rd grade. She is eight years
		// old", 'i');
		// p.spaceWithTab("geethika manasi parella is in 3rd grade");
		// p.charASCII('H');
		// p.asciiToChar(88);
		// p.toUpperAndLower("BharAthi");
		// p.replaceWord("Geethika is good girl. Geethika studies well. Geethika goes to
		// school daily.Geethika eats well. Geethika listens well");
		// p.polyndromString(JOptionPane.showInputDialog("Enter a string to check for
		// polyndrom or not"));
		// p.stringsEqual("jaya", "ja ya");
		// int x[][] = { { 20, 10, 2 }, { 2, 4, 5 }, { 3, 7, 1 } };
		// int y[][] = { { 21, 21, 7 }, { 1, 7, 25 }, { 23, 13, 65 } };
		// int a[] = { 32, 64, 13, 46, 68 };
		// int b[] = { 11, 22, 33, 44 };
		// p.printArrays(a);
		// p.sortArray(a);
		// p.sortString("bharathi");
		// p.add2DArrays(x, y);
		// p.mul2DArrays(x, y);
		// p.string2Array("Bharathi", "1234");
		// p.arrayiDelimiter("Geethika is a good girl");
		// p.wordsInString("I'm learning Java for selinium. Selinum is a good
		// technology");
		// p.reverseWords("Selinum is a good technology");
		// p.pascalTriangle(5);
		p.alphaOccurrence("sudh123kar");
	}

	// 1. Print Hello for n times

	public void printHello(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". Hello");
		}
	}

	// 2. Given number is odd number or not
	public void findOdd(int n) {
		if (n % 2 == 1) {
			System.out.println(n + " is an odd number");
		} else {
			System.out.println(n + " is not an odd number");
		}

	}

	// 3.print odd numbers between given range
	public void oddNumber(int rStart, int rEnd) {

		for (int i = rStart; i <= rEnd; i++) {
			if (i % 2 == 1) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();
	}

	// 4. Factorial of a given number
	public void factorial(int n) {
		int x = 1;
		for (int i = 1; i <= n; i++) {
			x = x * i;
		}
		System.out.println(x);
	}

	// 5. Find the factors of a given number
	public void findFactor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	// 6. Print Prime numbers between the given range of numbers
	public void primeNumbers(int n1, int n2) {

		for (int i = n1; i <= n2; i++) {
			int j;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.print(i + " ");
			}

		}
	}

	// 7. Swap 2 numbers without a temporary variable
	public void swapNumber(int n1, int n2) {
		n1 = n1 - n2;
		n2 = n1 + n2;
		n1 = n2 - n1;
		System.out.println(n1);
		System.out.println(n2);
	}

	// 8. program to Perform specified Arithmetic Operation on two given numbers
	public void operations(int x, int y, String operation) {
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

	// 9. Find the length of a given String

	public void stringLength(String str) {

		int l = str.length();
		System.out.println(l);

	}

	// 10. Reverse a string

	public void stringReverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			String rev = " ";
			rev = rev + str.charAt(i);
			System.out.print(rev + " ");
		}
	}

	
	// 11. Find how many alpha characters present in a string
	public void alphaOccurrence(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(str.charAt(i))) {
				count = count + 1;
			}
		}
		System.out.println("alphabetic occurance are : " + count);
	}

	// 12. Find the occurrences of a specific character in a string
	public void charOccurrence(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == c) {
				count = count + 1;
			}
		}
		System.out.println("occurance of '" + c + "' letter in '" + str + "' is: " + count);
	}

	// 13. Replace space with tab
	public void spaceWithTab(String str) {
		String x = str.replaceAll(" ", "\t");
		System.out.println(x);
	}

	// 14. Program to return an ASCII value of a given character
	public void charASCII(char c) {
		int ascii = (int) c;
		System.out.println(ascii);
	}

	// 15. program to return the character corresponding to the given ASCII value

	public void asciiToChar(int x) {
		char c = (char) x;
		System.out.println(c);
	}

	// 16. & 17. convert string toupper and tolower case

	public void toUpperAndLower(String str) {

		String str1 = str.toLowerCase();
		System.out.println("Lowercase converted string: " + str1);
		String str2 = str.toUpperCase();
		System.out.println("Uppercase converted string: " + str2);
	}

	// 18. Replace word with another word
	public void replaceWord(String str) {
		String x = str.replaceAll("Geethika", "Harika"); // we can use replace or replaceAll methods.
		System.out.println(x);
	}

	// 19. Check whether the given string is polyndrom or not

	public void polyndromString(String str) {
		String poly = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			poly = poly + str.charAt(i);
		}
		System.out.println(poly + ":");
		if (str.equals(poly)) {
			System.out.println("Given string is a polyndrom: ");
		} else {
			System.out.println("Given string is not a polyndrom: ");
		}
	}

	// 20. Check the given 2 strings are equal or not

	public void stringsEqual(String str1, String str2) {
		if (str1 == str2) {
			System.out.println("Given 2 strings are equal");
		} else {
			System.out.println("Given 2 strings are not equal");
		}

	}

	// 21. print all the values of an array
	public void printArrays(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	// 22. Sort and print the array list
	public void sortArray(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

	// 23. Sort the characters in given string
	public void sortString(String str) {
		char ch[] = str.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			System.out.print(ch[i] + "  ");
		}
	}

	// 24. Adding 2 dimensional arrays

	public void add2DArrays(int arr1[][], int arr2[][]) {
		int arr3[][] = new int[arr1.length][arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 25. Multiplying 2 D arrays
	public void mul2DArrays(int arr1[][], int arr2[][]) {
		int arr3[][] = new int[arr1.length][arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr3[i][j] = arr1[i][j] * arr2[i][j];
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// 26. convert the string into an array
	public void string2Array(String str1, String str2) {
		char ch[] = str1.toCharArray();
		String intsplit[] = str2.split(" ");
		int n[] = new int[intsplit.length];
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(intsplit[i]);
			System.out.print(n[i] + 1234);
		}
	}

	// 27. convert the string into an array using 'i' as delimiter

	public void arrayiDelimiter(String str) {
		String[] strsplit = str.split(" ");
		for (int i = 0; i < strsplit.length; i++) {
			System.out.println("Split " + (i + 1) + ":" + strsplit[i]);
		}
	}

	// 28. find the number of words in a string
	public void wordsInString(String str) {
		String[] strsplit = str.split(" ");
		// int count = 0;
		System.out.println("Number of words in a given string are " + strsplit.length);
	}

	// 29. Write a program to reverse the words of a given string
	public void reverseWords(String str) {
		String[] strSplit = str.split(" ");
		for (int i = strSplit.length - 1; i >= 0; i--) {
			String rev = "";
			rev = rev + strSplit[i];
			System.out.print(rev + " ");
		}

	}

	// 30. Print the data as a Pascal triangle

	public void pascalTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int val = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(val + " ");
				val = val * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}