package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.wd.util.DriverFactory;

public class Wd27HandlingMouseMovements_DragAndDrop_OnLocation {

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

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement elmSrc  = driver.findElement(By.id("draggable"));
		WebElement elmDst  = driver.findElement(By.id("droppable"));
		
		int x = elmDst.getLocation().getX();
		int y = elmDst.getLocation().getY();
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(elmSrc, x, y).build().perform();
		
	}

}










