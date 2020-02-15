package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends OhrmBase {
	
	
	public static By txt_UserName = By.id("txtUsername");
	public static By txt_Password = By.id("txtPassword");
	public static By btn_Login = By.id("btnLogin");
	
	
	public WebElement txtUserName() {
		return driver.findElement(txt_UserName);
	}

	public WebElement txtPassword() {
		return driver.findElement(txt_Password);
	}

	public WebElement btnLogin() {
		return driver.findElement(btn_Login);
	}

	// operational
	public void enterTextOnUserName(String txtToEnter) {
		txtUserName().sendKeys(txtToEnter);
		System.out.println(txtToEnter + " Entered on UserName");
	}

	public void enterTextOnPassword(String txtToEnter) {
		txtPassword().sendKeys(txtToEnter);
		System.out.println(txtToEnter + " Entered on Password");
	}

	public WelcomePage clickOnLoginButton() {
		btnLogin().click();
		System.out.println("Clicked on Login Button");
		return new WelcomePage();
	}

}
