package com.wd.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	public static WebDriver getDriver(String brname) {
		
		WebDriver driver =null;
		
		switch (brname.toLowerCase()) {
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project Basics\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disabled-notifications");
			
			driver= new ChromeDriver(co);
			
			break;
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Project Basics\\Browser Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			
			FirefoxProfile p = new FirefoxProfile();
			p.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions fo = new FirefoxOptions();
			fo.setProfile(p);
			
			driver = new FirefoxDriver(fo);
			break;
			
			

		default:
			System.out.println("No driver found");
			break;
		}
		
		return driver;
		
	}
	
	public static WebDriver getDriver(String brName, String osName) throws MalformedURLException {

		WebDriver driver = null;

		DesiredCapabilities cap = new DesiredCapabilities();

		switch (brName.toLowerCase()) {
		case "chrome":
			cap.setBrowserName(BrowserType.CHROME);
			break;
		case "firefox":
			cap.setBrowserName(BrowserType.FIREFOX);
			break;
		case "ie":
			cap.setBrowserName(BrowserType.IE);
			break;
		case "edge":
			cap.setBrowserName(BrowserType.EDGE);
			break;
		}

		switch (osName.toLowerCase()) {
		case "windows":
			cap.setPlatform(Platform.WINDOWS);
			break;
		case "mac":
			cap.setPlatform(Platform.MAC);
			break;
		case "win10":
			cap.setPlatform(Platform.WIN10);
			break;
		case "win8":
			cap.setPlatform(Platform.WIN8);
			break;
		case "win81":
			cap.setPlatform(Platform.WIN8_1);
			break;
		default:
			System.out.println("OS name not found. Give name as windows/mac/win10/win8/win81");
		}

		driver = new RemoteWebDriver(new URL(GlobalData.gridUrl), cap);
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
