package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd28WorkingWithElements_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		// get driver
		WebDriver driver = DriverFactory.getDriver("chrome");

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement timeout
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize the browser
		driver.manage().window().maximize();

		// navigate to application
		driver.get("http://opensource.demo.orangehrmlive.com/");

		//find element using java script and perform operation using webdriver
		
		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
		WebElement txtUSerName = (WebElement) jsDriver.executeScript("return document.getElementById('txtUsername');");
		
		txtUSerName.sendKeys("admin");
		
		//find element using webdriver and perform operation using java script
		WebElement elmPassword = driver.findElement(By.id("txtPassword"));
		
		jsDriver.executeScript("arguments[0].value='admin'", elmPassword);
		
		//find element and perform operation using java script
		jsDriver.executeScript("document.getElementById('btnLogin').click();");
		
	}

}











