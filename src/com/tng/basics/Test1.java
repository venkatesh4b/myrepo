package com.tng.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1 {
 
	@BeforeSuite
	public void beforeSuite() {
		  System.out.println("this is before suite");
	  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suite");
  }
  
  
  
  @BeforeGroups(groups="smoke")
	public void bg1() {
		System.out.println("this is before smoke group");
	}
	@Test(priority = 2,groups="smoke")
	public void t1() {
		System.out.println("this is t1 test method");
	}

	@Test(priority = 1)
	public void t2() {
		System.out.println("this is t2 test method");
		System.out.println("this is the change from git repo");
	}

}
