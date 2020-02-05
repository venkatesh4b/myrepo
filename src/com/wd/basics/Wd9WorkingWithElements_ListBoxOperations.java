package com.wd.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd9WorkingWithElements_ListBoxOperations {

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

		// select indian from country list
		WebElement elmCountry = driver.findElement(By.id("personal_cmbNation"));

		// method1 selection using visible text
		new Select(elmCountry).selectByVisibleText("Indian");

		Thread.sleep(1000);

		// method2 selection using value attribute of option tag
		new Select(elmCountry).selectByValue("2");

		Thread.sleep(1000);

		// method3 selection using index (display order of the item)
		new Select(elmCountry).selectByIndex(6);

		Thread.sleep(1000);

		// printListOptions(elmCountry);

		System.out.println(isListOptionExist(elmCountry, "Hyderabad"));
		System.out.println(isListOptionExist(elmCountry, "Indian"));

	}

	public static void printListOptions(WebElement elmLst) {
		// get items from list box
		Select lstCountry = new Select(elmLst);
		List<WebElement> lstOptions = lstCountry.getOptions();

		System.out.println("Number of list items:" + lstOptions.size());

		for (WebElement elm : lstOptions) {
			System.out.println(elm.getText());
		}
	}

	public static boolean isListOptionExist(WebElement elmLst, String lstOptName) {
		// get items from list box
		Select lstCountry = new Select(elmLst);
		List<WebElement> lstOptions = lstCountry.getOptions();

		for (WebElement elm : lstOptions) {
			if (elm.getText().equalsIgnoreCase(lstOptName)) {
				return true;
			}
		}

		return false;
	}

}
