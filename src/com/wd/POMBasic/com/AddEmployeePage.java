package com.wd.POMBasic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployeePage extends OhrmBase {
	
	public static By txt_FirstName = By.id("firstName");
	public static By txt_LastName=By.id("lastName");
	public static By btn_Save=By.id("btnSave");
	
	public WebElement txtFirstName() {
		return driver.findElement(txt_FirstName);
	}
	
	public WebElement txtLastName() {
		return driver.findElement(txt_LastName);
	}

	public WebElement btnSave() {
		return driver.findElement(btn_Save);
	}
	
	public void enterTextOnFirstName(String txtToEnter) {
		txtFirstName().sendKeys(txtToEnter);
		System.out.println(txtToEnter+ "Entered on FirstName");
	}
	
	public void enterTextOnLastName(String txtToEnter) {
		txtLastName().sendKeys(txtToEnter);
		System.out.println(txtToEnter+ "Entered on LastName");
	}
	
	public void clickOnSaveButton() {
		btnSave().click();
		System.out.println("clicked on saVE Button");
	}
}
