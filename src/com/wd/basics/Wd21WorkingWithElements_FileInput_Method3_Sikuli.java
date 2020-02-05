/*package com.wd.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.wd.util.DriverFactory;

public class Wd21WorkingWithElements_FileInput_Method3_Sikuli {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed {

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

		// upload file
		driver.findElement(By.id("photofile")).click();

		Thread.sleep(1000);

		String flPath = "C:\\Users\\envy\\Desktop\\Dec4th\\Data\\Selenium.png";
		String elmImgPath = "C:\\Users\\envy\\Desktop\\Dec4th\\ElmImages";

		//Screen scr = new Screen();
		//scr.type(elmImgPath + "\\txtFileName.JPG", flPath);

		Thread.sleep(1000);

		//scr.click(elmImgPath + "\\btnOpen.JPG");

		Thread.sleep(1000);

		// click on save
		driver.findElement(By.xpath("//input[@value='Save']")).click();

	}

}
*/