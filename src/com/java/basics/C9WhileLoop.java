package com.java.basics;

import javax.swing.JOptionPane;

public class C9WhileLoop {

	public static void main(String[] args) {
		
		int n=11;
		while(n<=10) {
			System.out.println("while loop started");
			System.out.println(n);
			n= Integer.parseInt(JOptionPane.showInputDialog("enter value for n"));
		}
		System.out.println("while loop ended");
		
		do {
			System.out.println("do loop started");
			System.out.println(n);
			n++;
		}while(n<=10);
		System.out.println("do loop ended");
	}

}
