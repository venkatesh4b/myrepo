package com.wd.pom;

public class OhrmAddEmployee_POM extends OhrmBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=getDriver("chrome");
		
		LoginPage loginPage=NavigateToApplication();
		
		loginPage.enterTextOnUserName("Admin");
		loginPage.enterTextOnPassword("admin123");
		
		WelcomePage welcomePage=loginPage.clickOnLoginButton();
		
		welcomePage.clickOnPIMLink();
		AddEmployeePage addEmpPage=welcomePage.clickOnAddEmpLink();
		
		addEmpPage.enterTextOnFirstName("Selenium");
		addEmpPage.enterTextOnLastName("2.0");
		addEmpPage.clickOnSaveButton();
		
		

	}

}
