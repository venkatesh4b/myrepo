package com.wd.loc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class OhrmAddEmployee_ByLocator extends OhrmLoc {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) {
		
		driver=DriverFactory.getDriver("chrome");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		wait= new WebDriverWait(driver, 10);
		
		
		getElement(txt_LoginPage_UserName).sendKeys("Admin");
		getElement(txt_LoginPage_Password).sendKeys("admin123");
		getElement(btn_LoginPage_Login).click();
		getElement(lnk_WelcomePage_PIM).click();
		getElement(lnk_WelcomePage_AddEmployee).click();
		getElement(txt_AddEmpPage_FirstName).sendKeys("Selenium");
		getElement(txt_AddEmpPage_LastName).sendKeys("3.0");
		getElement(btn_AddEmpPage_Save).click();
		
		driver.quit();
		
		
		

	}
	
	public static WebElement getElement(By locator) {
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
