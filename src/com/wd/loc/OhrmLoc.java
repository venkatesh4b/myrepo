package com.wd.loc;

import org.openqa.selenium.By;

public class OhrmLoc {
	
	public static By txt_LoginPage_UserName= By.id("txtUsername");
	public static By txt_LoginPage_Password= By.id("txtPassword");
	public static By btn_LoginPage_Login=By.id("btnLogin");
	
	public static By lnk_WelcomePage_PIM=By.linkText("PIM");
	public static By lnk_WelcomePage_AddEmployee=By.partialLinkText("Add Emp");
	
	
	public static By txt_AddEmpPage_FirstName=By.id("firstName");
	public static By txt_AddEmpPage_LastName= By.id("lastName");
	public static By btn_AddEmpPage_Save=By.xpath("//input[@value='Save']");
	
	}
