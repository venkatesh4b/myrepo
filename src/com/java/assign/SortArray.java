package com.java.assign;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[] = { 32, 64, 13, 46, 68 };
		 
		 sortArrays(a);

	}
	
	public static void sortArrays(int arr[]) {
		
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
		
	}
