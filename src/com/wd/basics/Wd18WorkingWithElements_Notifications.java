package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class Wd18WorkingWithElements_Notifications {

	public static void main(String[] args) throws InterruptedException {
		// get driver
		WebDriver driver = DriverFactory.getDriver("firefox");

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// maximize browser window
		driver.manage().window().maximize();

		// goto application
		driver.get("https://www.naukri.com/");

	}
}
