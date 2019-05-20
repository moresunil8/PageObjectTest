package com.webpage.testCases;

import org.testng.annotations.Test;

import com.webpage.PageObjects.HomePage;
import com.webpage.PageObjects.LoginPage;
import com.webpage.PageObjects.RegistrationPage;

public class AddCustomerTest extends BaseClass
{
	
@Test
public void addCustomer() throws Exception  
{	
	LoginPage lp=new LoginPage();
	lp.Login(driver);
	HomePage hp = new HomePage();
	hp.register(driver);
	RegistrationPage rp= new RegistrationPage();	
	//rp.readExcel();
	rp.addCustomer(driver);
	//hp.register(driver);
	//rp.writeExcel();
	


}
}