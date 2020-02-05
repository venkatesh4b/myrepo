package com.wd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	
	@FindBy(id="txtUsername")
	WebElement txtUserName;
	
	@FindBy(id="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	
	public void enterTextOnUsername(String txtToEnter) {
		
		txtUserName.sendKeys(txtToEnter);
		System.out.println(txtToEnter+ "Entered on UserName");
	}
	
	public void enterTextOnPassword(String txtToEnter) {
		txtPassword.sendKeys(txtToEnter);
		System.out.println(txtToEnter+"Entered on Password");
		
	}
	
	public void clickOnLoginButton() {
		btnLogin.click();
		System.out.println("clicked on Login Button");
	}
	
	
	

}
