package com.wd.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd13WorkingWithElements_Calendars_Static {

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

		// enter text on user name
		driver.findElement(By.cssSelector("input[id='txtUsername']")).clear(); // clears existing text
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("admin");

		// enter text on password
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();

		// click on PIM
		driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();

		// click on add employee
		driver.findElement(By.xpath("//a[contains(normalize-space(),'Add Emp')]")).click();

		// enter data in first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");

		// enter data in last name
		driver.findElement(By.id("lastName")).sendKeys("hq");

		// click on save
		driver.findElement(By.xpath("//input[@value='Save']")).click();

		// click on edit
		driver.findElement(By.xpath("//input[@value='Edit']")).click();

	
		//click on DOB calender button
		driver.findElement(By.xpath("//label[text()='Date of Birth']/..//img[@class='ui-datepicker-trigger']")).click();
		
		//select year
		WebElement elmYear = driver.findElement(By.className("ui-datepicker-year"));
		new Select(elmYear).selectByVisibleText("2006");
		
		//select month
		WebElement elmMonth = driver.findElement(By.className("ui-datepicker-month"));
		new Select(elmMonth).selectByVisibleText("Jul");
		
		//click on date
		WebElement calTbl = driver.findElement(By.className("ui-datepicker-calendar"));
		calTbl.findElement(By.linkText("30")).click();
		
	}

}












