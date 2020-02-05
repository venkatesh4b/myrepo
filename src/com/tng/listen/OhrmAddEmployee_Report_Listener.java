package com.tng.listen;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OhrmAddEmployee_Report_Listener {
	
	WebDriver driver;
	
	@BeforeClass
	public void OpenApplication() {

		try {

			// configure driver
			System.setProperty("webdriver.chrome.driver",
					"F:/SeleniumSoftware/BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("http://opensource.demo.orangehrmlive.com/");

			/*
			 * if(driver.getTitle().equalsIgnoreCase("orangehrm1")!=true){ throw
			 * new AssertionError("Title verification failed"); }
			 */

			Assert.assertTrue(driver.getTitle().equalsIgnoreCase("orangehrm"),
					"Title verification");
			Reporter.log("Open Application is passed");
		} catch (AssertionError ae) {
			
			Reporter.log("Failed to open page");
			Assert.fail("correct page is not opened in Application ");
		}
	}

	@Test
	public void Login() {
		try {

			driver.findElement(By.xpath("//input[@id='txtUsername']"))
					.sendKeys("admin");

			driver.findElement(By.xpath("//input[@id='txtPassword']"))
					.sendKeys("admin");

			driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

			Reporter.log("Login successful");
		} catch (AssertionError ae) {
	
			Assert.fail("verfication failure");
		} catch (NoSuchElementException nse) {
	
			
			Assert.fail("locating failure");
		} catch (StaleElementReferenceException ser) {
	
			Assert.fail("Failed to locate old reference of element");
		}

	}

	@Test(dependsOnMethods = "Login")
	public void AddEmployee() {
		driver.findElement(By.xpath("//a[.='PIM']")).click();
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(
				"selenium");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("hq");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	Reporter.log("Add Employee successful");
		
	}

	@AfterClass
	public void CloseApplication() {
		driver.quit();
		}
}




