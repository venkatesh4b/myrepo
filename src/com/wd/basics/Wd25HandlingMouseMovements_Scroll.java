package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.wd.util.DriverFactory;

public class Wd25HandlingMouseMovements_Scroll {

	public static void main(String[] args) {
		// get driver
		WebDriver driver = DriverFactory.getDriver("chrome");

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement timeout
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize the browser
		driver.manage().window().maximize();

		// navigate to application
		driver.get("https://jqueryui.com/droppable/");

		WebElement elm  = driver.findElement(By.linkText("Naukri on Mobile"));
		
		Actions act = new Actions(driver);
		act.moveToElement(elm).build().perform();
	
	}

}










