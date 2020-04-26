package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.BaseTest;

public class TestBase {
	public WebDriver driver;
	BaseTest bt=new BaseTest();
	@BeforeMethod
	public void setUp() {
		driver=bt.initilize();
		driver.get("https://www.flipkart.com/");
	}
	

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(30000);
		driver.quit();
	}

}
