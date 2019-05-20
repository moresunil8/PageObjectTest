package com.webpage.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	//WebDriver driver = new ChromeDriver();
	
	public void register(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();		
	}
	
	
}
	


