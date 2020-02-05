package com.tng.basics;

import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class OhrmAddEmpTest_DDT {
	
	public WebDriver driver;
  
  @BeforeClass
  public void openApplication() {
	  
	  driver= DriverFactory.getDriver("chrome");
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	}
  
  @Test
  public void login() {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin");
	  driver.findElement(By.id("btnLogin")).click();
  }
  @Test(dependsOnMethods="login", dataProvider="getEmpData", dataProviderClass=OhrmDP.class)
  public void addEmployee(HashMap<String, String> empData) {
	
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.partialLinkText("Add Emp")).click();
	driver.findElement(By.id("firstName")).sendKeys(empData.get("fname"));
	driver.findElement(By.id("lastName")).sendKeys(empData.get("lname"));
	driver.findElement(By.xpath("//input[@value='Save']")).click();  
  }
  
  @AfterClass
  public void closeApplication() {
	  driver.quit();
  }

}
