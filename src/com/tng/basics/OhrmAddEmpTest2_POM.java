package com.tng.basics;

import org.testng.annotations.Test;

import com.wd.pom.AddEmployeePage;
import com.wd.pom.LoginPage;
import com.wd.pom.OhrmBase;
import com.wd.pom.WelcomePage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class OhrmAddEmpTest2_POM  {
	
	public WebDriver driver;
	public OhrmBase ohrm;
	public LoginPage loginPage;

  @BeforeClass
  public void openApplication() {
	  
	  driver=ohrm.getDriver("chrome");
	 loginPage= ohrm.NavigateToApplication();
	  
	  
  }
  
  @Test
  public void addEmployee() {
	  loginPage.enterTextOnUserName("Admin");
	  loginPage.enterTextOnPassword("admin123");
	 WelcomePage welcomePage=loginPage.clickOnLoginButton();
	 
	 welcomePage.clickOnPIMLink();
	 AddEmployeePage addEmpPage=welcomePage.clickOnAddEmpLink();
	 
	 addEmpPage.enterTextOnFirstName("Selenium");
	 addEmpPage.enterTextOnLastName("TestNG");
	 addEmpPage.clickOnSaveButton();
  }

  @AfterClass
  public void closeApplication() {
	  
	  driver.quit();
  }

}
