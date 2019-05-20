package com.webpage.PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage 
{
	
	//public WebDriver driver;
	public String username;
	public String email;
	public String gender;
	public String dob;
	public String address;
	public String city;
	public String state;
	public String pin;
	public String mobile;
	public String password;
	public String CustomerID;
	public int i=1;
	public int rowcount;
	
		public void addCustomer(WebDriver driver) throws Exception
	{
		File src = new File ("C:\\Users\\Aparna\\eclipse-workspace\\WebsiteLoginPageObjects\\abcd.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Row count is "+rowcount);
		
		for (i=1;i<=rowcount;i++)
		{
			username = sheet1.getRow(i).getCell(0).getStringCellValue();
			gender = sheet1.getRow(i).getCell(1).getStringCellValue();
			dob = sheet1.getRow(i).getCell(2).getStringCellValue();
			address = sheet1.getRow(i).getCell(3).getStringCellValue();
			city = sheet1.getRow(i).getCell(4).getStringCellValue();
			state = sheet1.getRow(i).getCell(5).getStringCellValue();
			pin = sheet1.getRow(i).getCell(6).getStringCellValue();
			mobile = sheet1.getRow(i).getCell(7).getStringCellValue();
			email = sheet1.getRow(i).getCell(8).getStringCellValue();
			password = sheet1.getRow(i).getCell(9).getStringCellValue();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys(this.username);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.id("dob")).sendKeys(dob);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys(this.address);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys(this.city);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys(this.state);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys(this.pin);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).sendKeys(this.mobile);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys(this.email);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys(this.password);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
		CustomerID = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]")).getText();
		{
			System.out.println("customer ID is " +CustomerID);
			
		}
		
		//File wsrc=new File("C:\\Users\\Aparna\\eclipse-workspace\\WebsiteLoginPageObjects\\abcd.xlsx");
		//FileInputStream wfis = new FileInputStream(wsrc);
		//XSSFWorkbook wb1= new XSSFWorkbook(wfis);
		//XSSFSheet sheet2 = wb1.getSheetAt(0);
	//	int rowcount2 = sheet2.getLastRowNum();
			sheet1.getRow(i).createCell(10).setCellValue(CustomerID);
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Aparna\\eclipse-workspace\\WebsiteLoginPageObjects\\abcd.xlsx");
			wb.write(fos);
			//wb1.close();
			HomePage hp=new HomePage();
			hp.register(driver);
					
		}
	
	}
}
	
	

