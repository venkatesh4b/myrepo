package com.tng.basics;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestSample  {
  
	
	@Test()
	public void t2() {
		
		//hard assert
		assertEquals(true, true); //throws assertion error
		
		System.out.println("assert is executed");
		
	}
	@Test()
	public void t1() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, false,"verification1"); //doesn't throw exception
		sa.assertEquals(true, false,"verification2");
		sa.assertEquals(true, false,"verification3");
		
		sa.assertAll(); //throws assertion error
	}
	
	
	
}
