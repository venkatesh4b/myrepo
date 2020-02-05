package com.wd.basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Wd2FirefoxDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

	}

}
