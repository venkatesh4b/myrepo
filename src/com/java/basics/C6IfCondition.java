package com.java.basics;

import javax.swing.JOptionPane;

public class C6IfCondition {

	public static void main(String[] args) {
		
		//find odd number
		
		//+, -, / , *, % : modulas
		//= : assigning, == condition check
		
		int n=10;
		if(n%2==1) {
			System.out.println(n+" is an odd number");
		}else {
			System.out.println(n+" is not odd numer");
		}

		//find big number
				
		int x=Integer.parseInt(JOptionPane.showInputDialog("enter value for x"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("enter value for y"));
		
		if(x>y) {
			System.out.println("x is bigger");
		}else if(x<y){
			System.out.println("y is bigger");
		}else {
			System.out.println("both are equal");
		}
	}

}










