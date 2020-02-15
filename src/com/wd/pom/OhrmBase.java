package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OhrmBase {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(String brname) {
		
		switch (brname.toLowerCase()) {
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project Basics\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			
			driver= new ChromeDriver(co);
			
			
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Project Basics\\Browser Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			FirefoxProfile p = new FirefoxProfile();
			p.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions fo = new FirefoxOptions();
			fo.setProfile(p);
			
			driver= new FirefoxDriver(fo);

		default:
			System.out.println("driver not found");
			break;
		}
		return driver;
		
	}
	
	public static LoginPage NavigateToApplication() {
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		return new LoginPage();
		
	}
	
	
	
	
	
	
	

}
