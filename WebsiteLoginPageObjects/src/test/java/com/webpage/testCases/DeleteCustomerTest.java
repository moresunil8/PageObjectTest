package com.webpage.testCases;

import org.testng.annotations.Test;

import com.webpage.PageObjects.DeleteCustomerPage;
import com.webpage.PageObjects.LoginPage;

public class DeleteCustomerTest extends BaseClass 
{
	
	@Test
	public void delete() throws Exception
	{
		LoginPage lp=new LoginPage();
		lp.Login(driver);
		DeleteCustomerPage dc = new DeleteCustomerPage();
		dc.delete(driver);
		
		
	}
	
	
	

}
