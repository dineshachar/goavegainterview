package com.goavegaInterview.tests;

import org.testng.annotations.Test;

import com.goavega.pages.ViewUsersPage;

public class ViewUsersPageTest extends BaseTest{
	
	@Test
	public void accessCreateUserTest() throws Exception {
		ViewUsersPage viewUsers = new ViewUsersPage(driver);
		viewUsers.navigateToCreateUserPage();
	}
	
}
