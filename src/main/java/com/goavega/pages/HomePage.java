package com.goavega.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) throws InterruptedException {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement TEXT_USERNAME;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement TEXT_PASSWORD;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement BUTTON_LOGIN;
	
	public void login(String userName, String passWord) throws Exception {
		TEXT_USERNAME.clear();
		TEXT_USERNAME.sendKeys(userName);
		TEXT_PASSWORD.clear();
		TEXT_PASSWORD.sendKeys(passWord);
		Thread.sleep(2000);
		BUTTON_LOGIN.click();
	}

}
