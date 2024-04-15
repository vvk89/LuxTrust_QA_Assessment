package org.automation.luxtrust.test;

import java.io.FileInputStream;


import org.automation.luxtrust.base.Driver;
import org.automation.luxtrust.dataGenerator.dataGenerator;
import org.automation.luxturst.pages.form;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC1_submit_form extends Driver{
	
	@Test(dataProvider="Excel",dataProviderClass=dataGenerator.class)
	public boolean tc1_submit_form(String name,String mail,int phone,String userID,String pwd) throws Exception
	{
		form register = new form(driver);
		register.name("vivek");
		register.mail("vivek@LT.com");
		register.phone("+352 661867784");
		register.userID("vivek");
		register.pwd("pwd");
		register.submit();
		boolean flag=false;
		if(driver.findElement(By.id("submit")).getText().equalsIgnoreCase("Form submitted"))
		{
			flag=true;
					
		}
		return flag;
		 
	}

	

}
