package com.java.oops;

public class CreateEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		System.out.println(emp1.getAge());

		emp1.setAge(66);
		System.out.println(emp1.getAge());
		emp1.setAge(17);
		System.out.println(emp1.getAge());
		emp1.setAge(30);
		System.out.println(emp1.getAge());
	}

}
