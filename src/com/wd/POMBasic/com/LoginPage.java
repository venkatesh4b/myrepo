package com.wd.POMBasic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends OhrmBase {
	
	public static By txt_username= By.id("txtUsername");
	public static By txt_password=By.id("txtPassword");
	public static By btn_login=By.id("btnLogin");
	
	public WebElement txt_Username() {
		return driver.findElement(txt_username);
		
	}
	
	public WebElement txt_password() {
		return driver.findElement(txt_password);
	}
	
	public WebElement btn_login() {
		return driver.findElement(btn_login);
	}
	
	

	//operational
	public void enterTextOnUserName(String txtToEnter) {
		txt_Username().sendKeys(txtToEnter);
		System.out.println(txtToEnter +"Entered text on username");
		
	}
	
	public void enterTextOnPassword(String txtToEnter) {
		txt_password().sendKeys(txtToEnter);
		System.out.println(txtToEnter +"Entered text on password");
	}
	public void clickOnLoginbutton() {
		btn_login().click();
		System.out.println("clicked on login button");
	}
}
