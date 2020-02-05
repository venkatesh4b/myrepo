package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd12WorkingWithElements_CustomTableElementHandling {

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
		
		//click on search button for 3823
		clickSerachButtonByServiceNumber(driver, "3823");
	}

	public static void clickSerachButtonByServiceNumber(WebDriver driver,String sNo) {
		String xp = "//div[@class='srvceNO' and normalize-space()='"+sNo+"']/ancestor::div[@class='row']//input[@value='Select Seats']";
		driver.findElement(By.xpath(xp)).click();
	}
}











