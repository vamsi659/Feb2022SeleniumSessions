package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartRegister {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://www.opencart.com/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		//By Locators - OR
		By UserName = By.id("input-username");
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By Country = By.id("input-country");
		By Password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(UserName, "Vamsipurighalla");
		eleUtil.doSendKeys(FirstName, "Vamsi");
		eleUtil.doSendKeys(LastName, "Purighalla");
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(Country, "India");
		eleUtil.doSendKeys(Password, "ABCD123");
		
		//brUtil.quitBrowser();
		
		
	}

}