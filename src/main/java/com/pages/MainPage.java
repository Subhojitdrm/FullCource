package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseTest{
	private By clickCart=By.xpath("//a[@href='/viewcart?otracker=Cart_Icon_Click']");
	 
	public WebElement getClickCart() {
		waitingForYou(clickCart);
		return getElement(clickCart);
		
	}

	public String getTitles() {
		
		return driver.getTitle();
	}
	
	
	
	public void clickMainKart() {
		getClickCart().click();
	}

}
