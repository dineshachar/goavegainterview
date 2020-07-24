package com.goavegaInterview.tests;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gavegaInterview.libraries.GetPropertyValue;
import com.gavegaInterview.libraries.LaunchBrowser;


public class BaseTest {
	public static WebDriver driver;
	@BeforeTest
	public void initiateDriver() throws Exception {
		GetPropertyValue launchDetails = new GetPropertyValue();
		String browser = launchDetails.readPropertyValue("browser");
		String environment = launchDetails.readPropertyValue("environment");
		LaunchBrowser browserInstance = new LaunchBrowser();
		driver = browserInstance.openBrowser(browser, environment);
	
		
	}
	@Test
	public void Test() {
		System.out.println("");
	}
}
