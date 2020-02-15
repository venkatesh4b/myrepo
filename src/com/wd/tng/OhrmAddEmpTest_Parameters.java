package com.wd.tng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class OhrmAddEmpTest_Parameters {
	
	public WebDriver driver;
	
	@BeforeClass
	@Parameters({"brname", "appUrl"})
	public void openApplication(String brname,String appUrl) {
		
		driver=DriverFactory.getDriver(brname);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(appUrl);
		
		}
	@Test
	public void login() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test(dependsOnMethods="login")
	public void addEmployee() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.partialLinkText("Add Emp")).click();
		driver.findElement(By.id("firstName")).sendKeys("selenium");
		driver.findElement(By.id("lastName")).sendKeys("testng");
		driver.findElement(By.id("btnSave")).click();
		
	}
	
  @AfterClass
  public void closeApplication() {
	  driver.quit();
  }
}
