package com.gavegaInterview.libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public WebDriver driver;
	
	
	public WebDriver openBrowser(String browserName, String environment) {
		if (browserName.equalsIgnoreCase("chrome")) {

			System.out.println("Execute in Chrome");
			System.setProperty("webdriver.chrome.driver",
					"..\\goavega\\browser_executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")){
			System.out.println("Execute in Firefox");
			System.setProperty("webdriver.firefox.driver", "..\\goavega\\browser_executables\\geckodriver.exe"); 
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Enter the correct browser");
		}
		
		driver.manage().window().maximize();
		driver.get(environment);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
