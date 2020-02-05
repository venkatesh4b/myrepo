package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd8WorkingWithElements_AdvancedListBox {

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
		driver.get("http://www.apsrtconline.in/");

		
		String stPlace = "HYDERABAD";
		String endPlace = "VIJAYAWADA";
		
		//select start place
		driver.findElement(By.id("fromPlaceName")).sendKeys(stPlace);
		driver.findElement(By.linkText(stPlace)).click();
		
		//select end place
		driver.findElement(By.id("toPlaceName")).sendKeys(endPlace);
		driver.findElement(By.linkText(endPlace)).click();
		
		//click on calender
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//click on 30 date
		driver.findElement(By.linkText("30")).click();
		
		//click on search
		driver.findElement(By.id("searchBtn")).click();
		
		//filter ac busses
		driver.findElement(By.id("BtFid")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='A/C CLASS']")).click();
		
	}

}











