package com.simplilearn.Goibibo_selenium_tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplilearn.Goibibo_selenium_pages.LoginPage;
public class Test_GoibiboQuickLaunch extends BaseTest {
	@Test(description = "Simple test to launch Goibibo Flight Ticket Web Site")
	public void test() {
		
	LoginPage login = new LoginPage(driver);	
		
	}

}

