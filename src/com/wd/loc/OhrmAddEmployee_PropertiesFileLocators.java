package com.wd.loc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wd.util.DriverFactory;

public class OhrmAddEmployee_PropertiesFileLocators {
	
	static Properties p;
	public static WebDriver driver;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		p= new Properties();
		p.load(new FileInputStream("src\\com\\wd\\loc\\ohrm.properties"));
		
		driver=DriverFactory.getDriver("chrome");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(getLocator("txt_LoginPage_UserName")).sendKeys("Admin");
		driver.findElement(getLocator("txt_LoginPage_Password")).sendKeys("admin123");
		driver.findElement(getLocator("btn_LoginPage_Login")).click();
		
		driver.findElement(getLocator("lnk_WelocmePage_PIM")).click();
		driver.findElement(getLocator("lnk_WelcomePage_AddEmployee")).click();
		
		driver.findElement(getLocator("txt_AddEmpPage_FirstName")).sendKeys("Slenium");
		driver.findElement(getLocator("txt_AddEmpPage_LastName")).sendKeys("3.0");
		driver.findElement(getLocator("btn_AddEmpPage_Save")).click();
		
		driver.quit();
		
		

	}
	
	public static By getLocator(String propertyKeyName) {
		
		String[] arrProp=p.getProperty(propertyKeyName).split(";");
		
		switch (arrProp[0].toLowerCase()) {
		case "id":
			return By.id(arrProp[1]);
		case "name":
			return By.name(arrProp[1]);
		case "tagname":
			return By.tagName(arrProp[1]);
		case "classname":
			return By.className(arrProp[1]);
		case "linktext":
			return By.linkText(arrProp[1]);
		case "partiallinktext":
			return By.partialLinkText(arrProp[1]);
		case "xpath":
			return By.xpath(arrProp[1]);
		case "css":
			return By.cssSelector(arrProp[1]);

		default:
			return null;
		}
		
		
	}

}
