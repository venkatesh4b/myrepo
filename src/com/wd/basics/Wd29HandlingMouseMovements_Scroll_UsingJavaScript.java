package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.wd.util.DriverFactory;

public class Wd29HandlingMouseMovements_Scroll_UsingJavaScript {

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
		driver.get("https://www.naukri.com/");

		WebElement elm  = driver.findElement(By.linkText("Naukri on Mobile"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", elm);
	
	}

}
