package com.goavega.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) throws InterruptedException {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath ="//i[@class='demo-icon icon-users']")
	WebElement BUTTON_USERS_MENU;
	
	@FindBy (xpath = "(//a[@data-currentpage='users'])[1]")
	WebElement BUTTON_USERS;
	
	public void navigateToUsersPage() {
		BUTTON_USERS_MENU.click();
		BUTTON_USERS.click();
	}
}
