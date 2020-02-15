package com.wd.pof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(linkText = "PIM")
	WebElement lnkPIM;
	
	@FindBy(partialLinkText = "Add Emp")
	WebElement lnkAddEmp;
	
	public void clickOnPIMLink() {
		lnkPIM.click();
		System.out.println("Clicked on PIM Link");
	}
	
	public void clickOnAddEmpLink() {
		lnkAddEmp.click();
		System.out.println("clicked on Add Employee link");
	}

}
