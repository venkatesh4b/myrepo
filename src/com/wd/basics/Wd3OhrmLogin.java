package com.wd.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.util.DriverFactory;

public class Wd3OhrmLogin {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getDriver("chrome");

		// driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");

		// entering text on username
		WebElement elmUserName = driver.findElement(By.id("txtUsername"));
		elmUserName.sendKeys("admin");

		// print the entered text
		System.out.println(driver.findElement(By.id("txtUsername")).getAttribute("value"));

		// enter text on password
		driver.findElement(By.name("txtPassword")).sendKeys("admin");

		// get text from button
		System.out.println(driver.findElement(By.id("btnLogin")).getAttribute("value"));
		// click on login button
		driver.findElement(By.id("btnLogin")).click();

	}

}
