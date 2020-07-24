package com.goavegaInterview.tests;

import com.gavegaInterview.libraries.GetPropertyValue;
import com.gavegaInterview.libraries.ReadLoginCredentials;
import com.goavega.pages.HomePage;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	

	@Test
	public void loginToApplication() throws Exception {
		
		GetPropertyValue launchDetails = new GetPropertyValue();
		String excelLocation = launchDetails.readPropertyValue("excelFileLocation");
		System.out.println("Excel Location is " + excelLocation);
		ReadLoginCredentials loginDetails = new ReadLoginCredentials(excelLocation);
		String username = loginDetails.readExcelData("login_credentials", 1, 0);
		String password = loginDetails.readExcelData("login_credentials", 1, 1);
		
		HomePage loginToApplication = new HomePage(driver);
		loginToApplication.login(username, password);
	}

}
