package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest { 
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static WebDriver initilize() {
		System.setProperty("webdriver.chrome.driver","E:\\Flipkart_testing\\com.flipkartTesting\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	public void waitingForYou(By locator) {
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
