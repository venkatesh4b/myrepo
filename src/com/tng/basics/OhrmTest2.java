package com.tng.basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class OhrmTest2 {
  @Test(groups="smoke")
  public void addEmployee() {
	  System.out.println("Employee added");
	  
  }
  
  @Test
  public void editEmployee() {
	  System.out.println("Employee edited");
  }
  @Test
  public void deleteEmployee() {
	  System.out.println("employee deleted");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Logged into application");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logged out application");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Opened appilcation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("closed application");
  }

}
