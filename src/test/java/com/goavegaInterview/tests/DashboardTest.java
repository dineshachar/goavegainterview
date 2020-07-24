package com.goavegaInterview.tests;

import org.testng.annotations.Test;

import com.goavega.pages.DashboardPage;

public class DashboardTest extends BaseTest{

	@Test
	public void acccessUserPage() throws Exception {
		DashboardPage accessDashboard = new DashboardPage(driver);
		accessDashboard.navigateToUsersPage();
	}
	
}
