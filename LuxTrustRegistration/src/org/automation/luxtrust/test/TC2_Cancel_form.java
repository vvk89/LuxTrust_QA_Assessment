package org.automation.luxtrust.test;

import java.io.FileInputStream;


import org.automation.luxtrust.base.Driver;
import org.automation.luxtrust.dataGenerator.dataGenerator;
import org.automation.luxturst.pages.form;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TC2_Cancel_form extends Driver{
	
	@Test(dataProvider="Excel",dataProviderClass=dataGenerator.class)
	public  boolean TC2_Cancel_form(String name,String mail,int phone,String userID,String pwd) throws Exception
	{
		form register = new form(driver);
		register.name("vivek");
		register.mail("vivek@LT.com");
		register.phone("+352 661867784");
		register.userID("vivek");
		register.pwd("pwd");
		register.cancel();
		
		boolean flag=false;
		if(driver.findElement(By.id("test")).getText().equalsIgnoreCase("form cancelled "))
		{
			flag=true;
					
		}
		return flag;
	}

	

}
