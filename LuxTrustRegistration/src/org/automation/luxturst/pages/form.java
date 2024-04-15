package org.automation.luxturst.pages;

import java.io.IOException;

import org.automation.luxtrust.utility.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class form {
	
	WebDriver driver;
	public form(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void name(String name) throws Exception
	{
		driver.findElement(By.id(utility.fetchlocator("name_id"))).sendKeys(name);
		
	}
	public void phone(String phone) throws Exception
	{
		driver.findElement(By.id(utility.fetchlocator("phone_id"))).sendKeys(phone);
	}
	public void mail(String mail) throws IOException
	{
		driver.findElement(By.id(utility.fetchlocator("mail_id"))).sendKeys(mail);
	}
	
	public void userID(String userID) throws IOException
	{
		driver.findElement(By.id(utility.fetchlocator("userID_id"))).sendKeys(userID);
	}	
	
	public void pwd(String pwd) throws IOException
	{
		driver.findElement(By.id(utility.fetchlocator("pwd_id"))).sendKeys(pwd);
	}	
	public void submit() throws IOException
	{
		
		driver.findElement(By.id(utility.fetchlocator("submit_xpath"))).click();
	}	
	
	public void clear() throws IOException
	{
		
		driver.findElement(By.id(utility.fetchlocator("clear_xpath"))).click();
	}	
	public void cancel() throws Exception
	{
		
		driver.findElement(By.id(utility.fetchlocator("cancel_xpath"))).click();
	}

}
