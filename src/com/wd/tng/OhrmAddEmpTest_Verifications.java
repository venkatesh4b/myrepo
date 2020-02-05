package com.wd.tng;

import org.testng.annotations.Test;

import com.wd.util.DriverFactory;
import com.wd.util.WebUtils;

import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class OhrmAddEmpTest_Verifications  {
 
	public WebDriver driver;
	 
	@BeforeClass
	  
	 public void openApplication() {
		
		try {
			
			//get driver
			driver= DriverFactory.getDriver("chrome");
			
			//specify page load timeout
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			//specify findelement timeout
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//Maximize window
			driver.manage().window().maximize();
			//navigate to application
			driver.get("https://opensource-demo.orangehrmlive.com");
		
			// asserttrue will expect a true status
			// if true is not returned by the statement then it throws assertionerror
			Assert.assertTrue(WebUtils.isElementExist(driver, By.id("txtUserName")), "VerifyLoginPageDisplayed");
			System.out.println("Application opened");
			Reporter.log("VerifyLoginPageDisplayed"); 
			
		} catch (AssertionError ae) {
			//report error
			System.out.println("Failed in Verification"+ ae.getMessage());
			Reporter.log("Failed in Verification"+ae.getMessage());
			throw ae;
		}
		
		catch (NullPointerException n) {
			System.out.println("Failed due to driver not assigned");
			Reporter.log("Failed due to driver not assigned");
			throw n;
			
		}
			
	/*	//verify if application opened
		if (WebUtils.isElementExist(driver, By.id("txtUsername"))) {
			System.out.println("Application opened");
			
		} else {
			System.out.println("Login page is not opened ");
			throw new AssertionError("Login page is not opened");

		}*/
		 
		 
	  }
	
	 @Test
	 public void login() {
		try { 
		 //enter text on username
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 Reporter.log("Entered text on username");
		 //enter text on password
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 Reporter.log("entered text on password");
		 //click on login
		 driver.findElement(By.id("btnLogin")).click();
		 Reporter.log("clicked on login button");
		 
		 Assert.assertTrue(WebUtils.isElementExist(driver, By.linkText("PIM")), "VerifyWelcomePageOpened");
		 Reporter.log("Login Successful and welcome page is opened");
		
	} catch (NoSuchElementException ns) {
		System.out.println("Login failed due to element not found " + ns.getMessage());
		Reporter.log("Login failed due to element not found " + ns.getMessage());
		throw ns;
		
	} catch (AssertionError a) {
		System.out.println("Login failed due to Verification Failed " + a.getMessage());
		Reporter.log("Login failed due to Verification Failed " + a.getMessage());
		throw a;
	}
		
	/* if (WebUtils.isElementExist(driver, By.linkText("PIM"))) {
		 
		 System.out.println("Welcome Page is displayed");
		
	} else {
			
		System.out.println("Welcome Page is not displayed");
		new Exception("Welcome Page is not displayed");
	}*/ 
		 
		 
	 }
	 
	 @Test(dependsOnMethods="login")
	 public void addEmployee() {
		
		 try {
			 
			//click on PIM link
			 driver.findElement(By.linkText("PIM")).click();
			 Reporter.log("Clicked on PIM link");
			 
			 //click on Add Employee link
			 driver.findElement(By.partialLinkText("Add Emp")).click();
			 Reporter.log("Clicked on Add employee link");
			 
			 //enter text on firstname
			 driver.findElement(By.id("txtFirstName")).sendKeys("Selenium");
			 Reporter.log("enter text on firstname");
			 
			 //enter text on last name
			 driver.findElement(By.id("txtLastName")).sendKeys("hq");
			 Reporter.log("enter text on lastname");
			 
			 //click on save
			 driver.findElement(By.id("btn_Save")).click();
			 Reporter.log("clicked on save");
			 
			 
			 assertTrue(WebUtils.isElementExist(driver, By.xpath("//h1[text()='Personal Details']")),
						"VerifyEmployeeAdded");
				System.out.println("Employee is added");
				/*
				 * // verify welcome page is opened if (WebUtils.isElementExist(driver,
				 * By.xpath("//h1[text()='Personal Details']"))) {
				 * System.out.println("Employee Added"); } else {
				 * System.out.println("Failed to add employee"); new
				 * Exception("Failed to add employee"); }
				 */
			 	 
		 } catch (NoSuchElementException ns) {
				System.out.println("AddEmployee failed due to element not found " + ns.getMessage());
				Reporter.log("AddEmployee failed due to element not found " + ns.getMessage());
				throw ns;
			} catch (AssertionError a) {
				System.out.println("AddEmployee failed due to Verification Failed " + a.getMessage());
				Reporter.log("AddEmployee failed due to Verification Failed " + a.getMessage());
				throw a;
			}
			 	 
	 }
 

	 @AfterClass
	 public void afterClass() {
		 
		 driver.quit();
	 }

	}
