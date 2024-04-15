package org.automation.luxtrust.base;

import org.automation.luxtrust.utility.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Driver
	{
		public WebDriver driver ;
		@BeforeMethod
		public void InitateDriver() throws Exception
		
		{
			if(utility.fetchproperty("browserName" ).toString().equalsIgnoreCase("chrome" ))
			{
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver= new ChromeDriver();
			}
		driver.get(utility.fetchproperty("applicationURL").toString());
		}
	

	@AfterMethod
	public void CloseDriver()
	{
	driver.quit();
	}
	}

