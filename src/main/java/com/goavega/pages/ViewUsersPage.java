package com.goavega.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewUsersPage extends BasePage{

	public ViewUsersPage(WebDriver driver) throws InterruptedException {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//label[@class='menu-open-button togglebtn-create round-btn']")
	WebElement BUTTON_ADD_USER_MENU;
	
	@FindBy (xpath = "//a[@id='lnkCreateUser']")
	WebElement BUTTON_CREATE_USER;
	
	public void navigateToCreateUserPage() throws InterruptedException {
		Thread.sleep(1000);
		BUTTON_ADD_USER_MENU.click();
		Thread.sleep(500);
		BUTTON_CREATE_USER.click();
	}
}
