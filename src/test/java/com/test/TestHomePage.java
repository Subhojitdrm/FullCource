package com.test;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.MainPage;

public class TestHomePage extends TestBase {
	HomePage hp = new HomePage();

	@Test(priority = '1')
	public void testForPositiveResponse() {
		MainPage mp = hp.getCorrectPath("8792506747", "Subho.123");
		String mpTitle = mp.getTitles();
		System.out.println(mpTitle);
		mp.clickMainKart();
	}
	@Test(priority='2')
	public void testForNegativeResponse() {
		String missingPassword=hp.getCorrectPath("8792506747");
		System.out.println(missingPassword);
		
	}
	@Test(priority='3')
	public void testForIncorrectPass() {
		String incorrectPass=hp.forIncorrectPass("8792506747","Sub");
		System.out.println(incorrectPass);
		
	}
}
