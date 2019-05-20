package com.webpage.testCases;

import org.testng.annotations.Test;

import com.webpage.PageObjects.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test	
	public void loginTest() 
	{
		LoginPage lp=new LoginPage();
		lp.Login(driver);
		
	}
}
