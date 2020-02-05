package com.wd.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd10WorkingWithElements_StandardTables_GetData {

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

		
		//get table
		WebElement elmTbl = driver.findElement(By.id("resultTable"));
		
		//get rows from table		
		List<WebElement> lstRows = elmTbl.findElements(By.tagName("tr"));
		
		
		List<WebElement> lstHeaders = lstRows.get(0).findElements(By.tagName("th"));
		for(int h=0;h<lstHeaders.size();h++) {
			System.out.println(lstHeaders.get(h).getText());
		}
		
		for(int r=1;r<lstRows.size();r++) {
			//get cells from each row 
			List<WebElement> lstTds = lstRows.get(r).findElements(By.tagName("td"));
			for(int c=0;c<lstTds.size();c++) {
				System.out.println(lstTds.get(c).getText());
			}
		}
	}

}
















