package com.java.basics;

public class C8ForLoop {

	public static void main(String[] args) {
		
		/*
		 for(Initialization:condition:Incrementation){
		 	statements;
		  }
		 
		 Initialization : Initialize a counter
		 Condition: Verify Counter
		 increment: increment counter
		 */

		//print hello for 10 times
		for(int i=1;i<=10;i++) {
			System.out.println("hello"+i);
		}
		
		//print number from 20 to 30
		for(int i=20;i<=30;i++) {
			System.out.println(i);
		}
		
		//print values from 10 to 1
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		//print odd numbers between 10 and 50
		for(int i=11;i<=50;i+=2) {
			System.out.println(i);
		}
		
		//Actual Logic
		for(int i=10;i<=50;i++) {
			
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		//Print 2nd table
		int n=2;
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		
		//print data of an array
		int arr[]= {10,20,30};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
		/*
		 for(datatype variable: array/collection name){
		 	
		 	syso(variable);
		 
		 }
		 */
		
		
		//print denominations for the given number
		
		//3*2000
		//3*500
		//2*200
		//1*50
		//2*20
		//1*5
		//2*2
		int m = 7999;
		int den[] = {2000,500,200,100,50,20,10,5,2,1};
		
		for(int d=0;d<den.length;d++) {
			int nd = m/den[d];
			
			if(nd!=0) {
				System.out.println(nd+"*"+den[d]);
				m=m-(nd*den[d]);	
			}
			
		}
	}

}














