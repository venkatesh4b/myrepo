package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd17WorkingWithElements_Alerts {

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
		driver.get("http://www.apsrtconline.in/");

		String stPlace = "HYDERABAD";
		String endPlace = "VIJAYAWADA";

		driver.findElement(By.id("searchBtn")).click();

		Alert al = driver.switchTo().alert();
		if (al.getText().equalsIgnoreCase("Please select start place.")) {
			System.out.println("Start place message displayed");
		}

		al.accept();
		
		// select start place
		driver.findElement(By.id("fromPlaceName")).sendKeys(stPlace);
		driver.findElement(By.linkText(stPlace)).click();

		driver.findElement(By.id("searchBtn")).click();
		
		if (al.getText().equalsIgnoreCase("Please select end place.")) {
			System.out.println("end place message displayed");
		}
		al.accept();
		
		// select end place
		driver.findElement(By.id("toPlaceName")).sendKeys(endPlace);
		driver.findElement(By.linkText(endPlace)).click();

		// click on search
		driver.findElement(By.id("searchBtn")).click();

		
		//alert.accept clicks on ok button
		//alert.dismis clicks on cancel button
		//alert.sendkeys(text) send text to alert
		//alert.gettext will get text from alert
	}

}
















