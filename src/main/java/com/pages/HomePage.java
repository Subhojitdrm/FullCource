package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest {
	public BaseTest baseTestCall = new BaseTest();
	private By loginLocator = By.xpath("//span[text()='Enter Email/Mobile number']//parent::label//parent::div//input");
	private By passwordLocator = By.xpath("//span[text()='Enter Password']//parent::label//parent::div//input");
	private By loginButton = By.xpath("//span[text()='Login']//parent::button");
	private By missingPassword = By.xpath("//span[text()='Forgot?']//parent::a//following::span//span");
	private By incorrectPassword = By
			.xpath("//span[text()='Enter Email/Mobile number']//parent::label//following::span//span");

	public WebElement getmissingPassword() {
		return baseTestCall.getElement(missingPassword);
	}

	public WebElement getincorrectPassword() {
		return baseTestCall.getElement(incorrectPassword);
	}

	public WebElement getLoginLocator() {
		return baseTestCall.getElement(loginLocator);
	}

	public WebElement getPasswordLocator() {

		return baseTestCall.getElement(passwordLocator);
	}

	public WebElement getLoginButton() {

		return baseTestCall.getElement(loginButton);
	}

	public MainPage getCorrectPath(String userName, String passWord) {

		getLoginLocator().sendKeys(userName);
		getPasswordLocator().sendKeys(passWord);
		getLoginButton().click();
		return new MainPage();
	}

	// negative test-cases-01
	public String getCorrectPath(String userName) {

		getLoginLocator().sendKeys(userName);
		getLoginButton().click();
		return getmissingPassword().getText();
	}

	// negative test-cases-02
	public String forIncorrectPass(String userName, String passWord) {

		getLoginLocator().sendKeys(userName);
		getPasswordLocator().sendKeys(passWord);
		getLoginButton().click();
		return getincorrectPassword().getText();
	}

}
