package com.tng.basics;

import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class OhrmAddEmpTest1 {
	public WebDriver driver;
	
	@BeforeClass
	  public void openApplication() {
		  
		  driver=DriverFactory.getDriver("chrome");
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	}
  @Test
  public void loginPage() {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
  @Test(dependsOnMethods="loginPage")
  public void addEmployeePage() {
	  driver.findElement(By.linkText("PIM")).click();
	  driver.findElement(By.partialLinkText("Add Emp")).click();
	  driver.findElement(By.id("firstName")).sendKeys("selenium");
	  driver.findElement(By.id("lastName")).sendKeys("TestNG");
	  driver.findElement(By.id("btnSave")).click();
	  
  }
  


  @AfterClass
  public void closeApp() {
	  driver.quit();
  }

}
