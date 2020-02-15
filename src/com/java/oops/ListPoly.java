package com.java.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class ListPoly {

	public static void main(String[] args) throws InterruptedException {

		// get driver
		WebDriver driver = DriverFactory.getDriver("chrome");
		
		
	}

	public static boolean isListOptionExist(Select lst, String lstOptName) {

		List<WebElement> lstOptions = lst.getOptions();

		for (WebElement elm : lstOptions) {
			if (elm.getText().equalsIgnoreCase(lstOptName)) {
				return true;
			}
		}

		return false;
	}

	public static boolean isListOptionExist(WebElement elmLst, String lstOptName) {
		// get items from list box
		Select lstCountry = new Select(elmLst);
		List<WebElement> lstOptions = lstCountry.getOptions();

		for (WebElement elm : lstOptions) {
			if (elm.getText().equalsIgnoreCase(lstOptName)) {
				return true;
			}
		}

		return false;
	}

	public static boolean isListOptionExist(WebDriver driver, By locator, String lstOptName) {
		WebElement elmLst = driver.findElement(locator);
		Select lstCountry = new Select(elmLst);
		List<WebElement> lstOptions = lstCountry.getOptions();

		for (WebElement elm : lstOptions) {
			if (elm.getText().equalsIgnoreCase(lstOptName)) {
				return true;
			}
		}

		return false;
	}
}
