package com.goavegaInterview.tests;


import org.testng.annotations.Test;

import com.goavega.pages.CreateUser;
public class CreateUserTest extends BaseTest{
	
	@Test
	public void createUser() throws Exception {
		
		CreateUser user = new CreateUser(driver);
		user.createUser();
		Thread.sleep(5000);
		user.addUserToGroup();
	}
	
	
}
