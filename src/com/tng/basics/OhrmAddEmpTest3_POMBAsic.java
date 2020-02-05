package com.tng.basics;

import org.testng.annotations.Test;

import com.wd.POMBasic.com.OhrmBase;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.testng.annotations.AfterClass;

public class OhrmAddEmpTest3_POMBAsic {
	
	OhrmBase ohrm;

  @BeforeClass
  public void openApplication() {
	  
	  ohrm = new OhrmBase();
	  ohrm.openApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
	  
  }
  @Test
  public void login() {
	  
	  ohrm.loginPage.enterTextOnUserName("Admin");
	  ohrm.loginPage.enterTextOnPassword("admin123");
	  ohrm.loginPage.clickOnLoginbutton();
  }
  
  @Test(dependsOnMethods="login")
  public void addEmployeePage() {
	  
	  ohrm.welcomePage.clickOnPIM();
	  ohrm.welcomePage.clickOnAddEmployee();
	  ohrm.addEmpPage.enterTextOnFirstName("Selenium");
	  ohrm.addEmpPage.enterTextOnLastName("TestNg");
	  ohrm.addEmpPage.clickOnSaveButton();
  }

  @AfterClass
  public void closeApplication() {
  
	 ohrm.driver.quit();
  }

}
