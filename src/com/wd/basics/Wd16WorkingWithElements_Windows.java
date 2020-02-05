package com.wd.basics;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class Wd16WorkingWithElements_Windows {

	public static void main(String[] args) throws InterruptedException {
		// get driver
		WebDriver driver = DriverFactory.getDriver("chrome");

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// maximize browser window
		driver.manage().window().maximize();

		// goto application
		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("sign-in-icon-down")).click();

		driver.findElement(By.id("signInLink")).click();

		// switch to frame
		// driver.switchTo().frame(0); using frame index
		// driver.switchTo().frame("id/name");using id or name

		WebElement frmElm = driver.findElement(By.className("modalIframe"));
		driver.switchTo().frame(frmElm); // switch to frame using frame element

		// from now we can work with elements in that frame
		driver.findElement(By.xpath("//button[text()='Sign in with Facebook']")).click();

		// now it opens a facebook window

		// to work with that window find handler value of that window

		String mWndHanle = driver.getWindowHandle();

		Set<String> strWndHandles = driver.getWindowHandles();

		for (String wnd : strWndHandles) {
			System.out.println(wnd);
			driver.switchTo().window(wnd);

			if (driver.getTitle().equalsIgnoreCase("Facebook")) {
				break;
			}
		}

		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");

		driver.switchTo().window(mWndHanle);

		// driver.close(); //closes the focused window
		driver.quit();// closes all windows opned in current session
	}

	public static void switchToWindowByTitle(WebDriver driver, String wndTitle) {
		Set<String> strWndHandles = driver.getWindowHandles();

		for (String wnd : strWndHandles) {
			System.out.println(wnd);
			if (driver.getTitle().equalsIgnoreCase(wndTitle)) {
				System.out.println("Switched to window:" + wndTitle);
				break;
			}
		}

	}
}
