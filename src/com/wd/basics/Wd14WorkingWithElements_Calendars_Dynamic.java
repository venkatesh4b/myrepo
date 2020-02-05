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

public class Wd14WorkingWithElements_Calendars_Dynamic {

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

		// Thread.sleep(5000);

		// driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();

		Thread.sleep(2000);

		// get calendar element
		WebElement elmCalendar = driver.findElement(By.id("rb-calendar_onward_cal"));

		String month = "Jan";
		String dt = "30";

		boolean mFound = false;

		while (mFound == false) {
			elmCalendar = driver.findElement(By.id("rb-calendar_onward_cal"));
			// highlightElement(driver, elmCalendar);
			// highlightElement(driver,
			// elmCalendar.findElement(By.className("monthTitle")));
			String mTitle = elmCalendar.findElement(By.className("monthTitle")).getText();
			System.out.println(mTitle);
			if (mTitle.contains(month)) {
				List<WebElement> lstDt = elmCalendar.findElements(By.xpath("//td[text()='" + dt + "']"));
				System.out.println(lstDt.size());
				// highlightElement(driver, lstDt.get(lstDt.size()-1));
				lstDt.get(lstDt.size() - 1).click();
				mFound = true;
			} else {
				// highlightElement(driver, elmCalendar.findElement(By.className("next")));
				elmCalendar.findElement(By.className("next")).click();
				Thread.sleep(1000);
			}

		}
	}

	public static void highlightElement(WebDriver driver, WebElement elm) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='5px dotted red'", elm);

	}
}
