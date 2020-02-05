package com.wd.pof;

public class OhrmAddEmp_Pof {
	
	public static void main(String[] args) {
		
		OhrmBase ohrm = new OhrmBase();
		ohrm.openApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
		ohrm.loginPage.enterTextOnUsername("Admin");
		ohrm.loginPage.enterTextOnPassword("admin123");
		ohrm.loginPage.clickOnLoginButton();
		
		ohrm.welcomePage.clickOnPIMLink();;
		ohrm.welcomePage.clickOnAddEmpLink();
		
		ohrm.addEmpPage.enterTextOnFirstName("Selenium");
		ohrm.addEmpPage.enterTextOnLastName("Webdriver");
		ohrm.addEmpPage.clickOnSaveButton();
		
	} 

}
