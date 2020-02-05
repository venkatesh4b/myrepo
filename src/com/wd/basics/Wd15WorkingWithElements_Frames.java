package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class Wd15WorkingWithElements_Frames {

	public static void main(String[] args) throws InterruptedException {
		// get driver
		WebDriver driver = DriverFactory.getDriver("chrome");

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// maximize browser window
		driver.manage().window().maximize();

		// goto application
		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("sign-in-icon-down")).click();
		
		driver.findElement(By.id("signInLink")).click();
		
		//switch to frame
		//driver.switchTo().frame(0); using frame index
		//driver.switchTo().frame("id/name");using id or name
		
		WebElement frmElm = driver.findElement(By.className("modalIframe"));
		driver.switchTo().frame(frmElm); //switch to frame using frame element
		
		//from now we can work with elements in that frame
		driver.findElement(By.xpath("//button[text()='signup with email']")).click();
		
		//to handle elements in main html page
		driver.switchTo().defaultContent();
		
		//use below statement for switch to frame
		//driver.switchTo().frame("");
		//if the frame is there in side of another frame (mainpage->frame->frame)
		//then switch frame and then switch to frame
		//now to come to parent frame use below statement
			//driver.switchTo().parentFrame();
		
		
	}
}















