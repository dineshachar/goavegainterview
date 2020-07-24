package com.goavega.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateUser extends BasePage {

	public CreateUser(WebDriver driver) throws InterruptedException {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "FirstName")
	WebElement TEXT_FIRST_NAME;

	@FindBy(name = "LastName")
	WebElement TEXT_LAST_NAME;

	@FindBy(xpath = "//input[@id='UserName']")
	WebElement TEXT_USERNAME;

	@FindBy(name = "EmailAddress")
	WebElement TEXT_EMAIL;

	@FindBy(id = "AccountExpiryDate")
	WebElement CALENDER_EXPIRY_DATE;

	@FindBy(xpath = "(//td[@class='day today active'])[1]")
	WebElement SELECT_TODAY_AS_EXPIRY_DATE;

	@FindBy(xpath = "//input[@class='upload']")
	WebElement FILE_UPLOAD_PROFILE_PICTURE;

	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	WebElement DROPDOWN_COUNTRY;

	@FindBy(xpath = "(//select[@class='form-control'])[2]")
	WebElement DROPDOWN_STATE;

	@FindBy(xpath = "(//input[@class='form-control'][@type='text'])[3]")
	WebElement TEXT_CITY;

	@FindBy(xpath = "(//input[@class='form-control'][@type='text'])[4]")
	WebElement TEXT_ZIPCODE;

	@FindBy(xpath = "//textarea[@class='form-control']")
	WebElement ADDRESS;

	@FindBy(xpath = "//*[text()='test1']")
	WebElement RADIO_TEST1;

	@FindBy(xpath = "//label[@class='MvcDynamicListFieldInputLabel'][text()='1']")
	WebElement CHECKBOX_1;

	//@FindBy(xpath = "//strong[contains(text(),'Save & Next:')]")
	@FindBy (id="btnCreateUser")
	WebElement BUTTON_SAVE_AND_NEXT;

	@FindBy (xpath = "//input[@id='txtsearchAvailableGroups']")
	WebElement BUTTON_SEARCH_GROUPS;
	
	@FindBy (xpath = "(//input[@placeholder='Search Here'])[1]")
	WebElement TEXT_SEARCH_STRING;
	
	@FindBy (xpath = "//*[contains(text(),'Magnifi group test')]")
	WebElement BUTTON_GROUP_MAGNIFI;
	
	@FindBy (xpath = "//a[@id='saveGroups']")
	WebElement BUTTON_FINISH;
	
	
	
	public void createUser() throws InterruptedException {
		TEXT_FIRST_NAME.sendKeys("Dinesh");
		TEXT_LAST_NAME.sendKeys("Achar");
		TEXT_USERNAME.sendKeys("dinesh.achar60");
		TEXT_EMAIL.sendKeys("hsn.dinesh60@gmail.com");
		CALENDER_EXPIRY_DATE.click();
		SELECT_TODAY_AS_EXPIRY_DATE.click();
		Thread.sleep(2000);
		FILE_UPLOAD_PROFILE_PICTURE.sendKeys("..//goavega//images//profile_image.png");
		Select country = new Select(DROPDOWN_COUNTRY);
		country.selectByValue("India");
		
		Select state = new Select(DROPDOWN_STATE);
		state.selectByValue("Karnataka");
		TEXT_CITY.sendKeys("Bangalore");
		TEXT_ZIPCODE.sendKeys("56001");
		ADDRESS.sendKeys("Kasturi Nagar");
		RADIO_TEST1.click();
		CHECKBOX_1.click();
		BUTTON_SAVE_AND_NEXT.click();
	}
	
	public void addUserToGroup() throws InterruptedException {
		BUTTON_SEARCH_GROUPS.click();
		TEXT_SEARCH_STRING.sendKeys("Magnifi group test");
		BUTTON_GROUP_MAGNIFI.click();
		BUTTON_FINISH.click();
	}

}
