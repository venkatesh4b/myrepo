package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Wd1ChromeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		
		driver.quit();
	}

}
