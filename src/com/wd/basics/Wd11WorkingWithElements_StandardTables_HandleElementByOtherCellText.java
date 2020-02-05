package com.wd.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd11WorkingWithElements_StandardTables_HandleElementByOtherCellText {

	public static void main(String[] args) throws InterruptedException {

		// get driver
		WebDriver driver = DriverFactory.getDriver("chrome");

		// specify page load timeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// specify findelement timeout
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize the browser
		driver.manage().window().maximize();

		// navigate to application
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// enter text on user name
		driver.findElement(By.cssSelector("input[id='txtUsername']")).clear(); // clears existing text
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("admin");

		// enter text on password
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");

		// click on login button
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();

		// click on PIM
		driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();

		selectEmpIdFromEmpListTable(driver, "0027");
/*		//get table
		WebElement elmTbl = driver.findElement(By.id("resultTable"));
		
		//get rows from table		
		List<WebElement> lstRows = elmTbl.findElements(By.tagName("tr"));

		for(int r=1;r<lstRows.size();r++) {
			//get cells from each row 
			List<WebElement> lstTds = lstRows.get(r).findElements(By.tagName("td"));
			if(lstTds.get(1).getText().equalsIgnoreCase("0024")) {
				lstTds.get(0).findElement(By.tagName("input")).click();
				break;
			}
		}*/
	}

	//handle above situation using xpath
	public static void selectEmpIdFromEmpListTable(WebDriver driver, String empId) {
		String strxPath = "//table[@id='resultTable']//td[2][normalize-space()='"+empId+"']/preceding-sibling::td/input";
		driver.findElement(By.xpath(strxPath)).click();
	}
}
















