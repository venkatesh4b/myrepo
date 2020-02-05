package com.tng.basics;

import org.testng.annotations.Test;

import com.wd.util.DataFactory;
import com.wd.util.DriverFactory;

import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class OhrmAddEmpTest_ScenarioDDT {
	
	public WebDriver driver;
	
	HashMap<String, String> tcMap;
  
  @BeforeClass
  public void openApplication() throws FileNotFoundException, IOException {
	  
	  tcMap = DataFactory.getTCData("TC_OHRM_AddEmployee_001");
	  driver= DriverFactory.getDriver("chrome");
	 
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  
  }
  
  @Test
  public void login() {
	  driver.findElement(By.id("txtUserName")).sendKeys(tcMap.get("Username"));
	  driver.findElement(By.id("txtPassword")).sendKeys(tcMap.get("Password"));
	  driver.findElement(By.id("btn_login")).click();
	  
	  
  }
  @Test(dependsOnMethods="login")
  public void addEmployee() {
	  driver.findElement(By.linkText("PIm")).click();
	  driver.findElement(By.partialLinkText("add Emp")).click();
	  driver.findElement(By.id("firstName")).sendKeys(tcMap.get("fname"));
	  driver.findElement(By.id("lastName")).sendKeys("lName");
	  driver.findElement(By.xpath("//input[@value='Save']")).click();
  }

  @AfterClass
  public void closeApplication() {
	  driver.quit();
  }

}
