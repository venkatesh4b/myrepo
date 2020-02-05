package com.wd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	
	WebDriver driver;
	public AddEmployeePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	
	@FindBy(id = "firstName") WebElement txtFirstName;
	@FindBy(id = "lastName") WebElement txtLastName;
	@FindBy(id = "btnSave") WebElement btnSave;
	
	public void enterTextOnFirstName(String txtToEnter) {
		txtFirstName.sendKeys(txtToEnter);
		System.out.println(txtToEnter+ "Entered on FirstName");
		
	}
	
	public void enterTextOnLastName(String txtToEnter) {
		txtLastName.sendKeys(txtToEnter);
		System.out.println(txtToEnter+ "Entered text on Password");
	}
	
	public void clickOnSaveButton() {
		btnSave.click();
	}

}
