package com.itom.driverBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Webdriverbase {
	WebDriver driver = null;
	
	@Parameters({"browsername"})
	@BeforeMethod
	public WebDriver setdriver(String wb)
	{
		
		if(wb.equalsIgnoreCase("chrome"))
		{
			String userdir=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",userdir +"\\Webdrivers\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(wb.equalsIgnoreCase("Firefox"))
		{
			String userdir=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",userdir +"\\Webdrivers\\Firefox\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
			driver=new InternetExplorerDriver();
		return driver;
	}
	
	/*@AfterMethod
	public void finalizedrivers()
	{
		
	}*/
	
}
