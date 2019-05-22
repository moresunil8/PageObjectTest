package com.webpage.PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerPage 
{
	public void delete(WebDriver driver) throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		File src=new File("C:\\Users\\Aparna\\eclipse-workspace\\WebsiteLoginPageObjects\\abcd.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Sheet1= wb.getSheetAt(0);
		int rowcount=Sheet1.getLastRowNum();
		System.out.println("row count is "+rowcount);
		for(int i=1;i<rowcount;i++)
		{
		String CustomerID=Sheet1.getRow(i).getCell(10).getStringCellValue();		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys(CustomerID);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
		Sheet1.getRow(i).getCell(10).setCellValue("deleted");
		}
		
	}

}
