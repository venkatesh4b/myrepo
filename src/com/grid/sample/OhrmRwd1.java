package com.grid.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OhrmRwd1 {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		
		// open chrome browser
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.180:4444/wd/hub/"), cap);

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement timeout
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize the browser
		driver.manage().window().maximize();

		// navigate to application
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter text on password
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();

		// click on PIM
		driver.findElement(By.linkText("PIM")).click();

		// click on add employee
		driver.findElement(By.partialLinkText("Add Emp")).click();

		// enter data in first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");

		// enter data in last name
		driver.findElement(By.id("lastName")).sendKeys("hq");

		// click on save
		driver.findElement(By.xpath("//input[@value='Save']")).click();

	}

}
