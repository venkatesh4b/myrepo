package com.wd.POMBasic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WelcomePage extends OhrmBase {
	
	public static By lnk_PIM=By.linkText("PIM");
	public static By lnk_AddEmployee=By.partialLinkText("Add Emp");
	
	public WebElement lnkPIM() {
		return driver.findElement(lnk_PIM);
	}

	public WebElement lnkAddEmployee() {
		return driver.findElement(lnk_AddEmployee);
	}
	
	
	public void clickOnPIM() {
		lnkPIM().click();
		System.out.println("clicked on PIM");
	}
	
	public void clickOnAddEmployee() {
		lnkAddEmployee().click();
		System.out.println("clicked on Add Employee");
	}
}
