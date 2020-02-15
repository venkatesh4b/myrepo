package com.wd.listen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class OrangeHrmLogin_Listen {

	public static void main(String[] args) {
		//configure driver
		System.setProperty("webdriver.chrome.driver",
				"F:/SeleniumSoftware/BrowserDrivers/chromedriver.exe");
		WebDriver wDriver = new ChromeDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(wDriver);
		driver.register(new WdEvents());
		
		
		driver.get("http://opensource.demo.orangehrmlive.com/");		
		
		//WebDriver driver = Wd5WedriverTestAll.openApplication("chrome", "http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Add Emplo")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("selenium");
		driver.findElement(By.name("lastName")).sendKeys("hq");
		
		driver.findElement(By.id("btnSave")).click();
		driver.quit();
	}

}











