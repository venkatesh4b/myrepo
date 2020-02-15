package com.java.excep;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.util.DriverFactory;

public class OhrmLogin_Excep {

	public static void main(String[] args) {
		
		WebDriver driver=DriverFactory.getDriver("chrome");
		
		try {
			 
			//driver.get("http://opensource.demo.orangehrmlive.com/");
			
			driver.navigate().to("http://opensource.demo.orangehrmlive.com");
			
			// entering text on username
			WebElement elmUserName = driver.findElement(By.xpath("//[txtUsername1"));
						elmUserName.sendKeys("admin");

			// print the entered text
			System.out.println(driver.findElement(By.id("txtUsername")).getAttribute("value"));

			// enter text on password
			driver.findElement(By.name("txtPassword")).sendKeys("admin");

			// get text from button
			System.out.println(driver.findElement(By.id("btnLogin")).getAttribute("value"));
			// click on login button
			driver.findElement(By.id("btnLogin")).click();
			
				
		} catch (Exception nse) {
			// TODO: handle exception
			
			System.out.println(nse.getMessage());
			
			//write code to report
			throw nse;
		}
		
		finally {
			driver.quit();
		}

	}
	
	
	
	public static boolean isElementExist(WebDriver driver, By Locator) {
		
		try {
			
			driver.findElement(Locator);
			return true;
			
		} catch (NoSuchElementException ns) {
			return false;
		}
		
		
	}
	
	
	
	
}
