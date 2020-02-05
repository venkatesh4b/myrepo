package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd7WorkingWithElements {

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
		driver.findElement(By.cssSelector("input[id='txtUsername']")).clear(); //clears existing text
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

		//click on edit
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		
		//select radio method1
		driver.findElement(By.id("personal_optGender_1")).click();
		
		//select radio method 2 (if there is no id)
		driver.findElement(By.xpath("//input[@name='personal[optGender]' and @value='1']")).click();
		
		//select radio method 3 (if there is no id and value)
		List<WebElement> lstGender = driver.findElements(By.name("personal[optGender]"));
		
		lstGender.get(0).click(); //clicks on first radio		
		
		//select indian from country list
		WebElement elmCountry = driver.findElement(By.id("personal_cmbNation"));
		new Select(elmCountry).selectByVisibleText("Indian");
		
		
		//click on employee List
		driver.findElement(By.linkText("Employee List")).click();
		
		//selecting checkbox
		
		if(!driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected()) {
			driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		}
		
		Thread.sleep(3000);
		
		//uncheck checkbox
		if(driver.findElement(By.id("ohrmList_chkSelectAll")).isSelected()) {
			driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		}
		
		
		// close browser
		driver.quit();
	}

}











