package com.wd.POMBasic.com;

public class OhrmAddEmployee_POM {
	
	public static void main(String[] args) {
		
		OhrmBase ohrm = new OhrmBase();
		ohrm.openApplication("firefox", "https://opensource-demo.orangehrmlive.com/");
		
		ohrm.loginPage.enterTextOnUserName("Admin");
		ohrm.loginPage.enterTextOnPassword("admin123");
		ohrm.loginPage.clickOnLoginbutton()
		;
		
		ohrm.welcomePage.clickOnPIM();
		ohrm.welcomePage.clickOnAddEmployee();
		
		ohrm.addEmpPage.enterTextOnFirstName("Selenium");
		ohrm.addEmpPage.enterTextOnLastName("Hq");
		ohrm.addEmpPage.clickOnSaveButton();
		
	
		
		
		} 

}
