package com.itom.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetupPage
{
	public void viewAvailableintegration()
	{
		WebDriver wd = new ChromeDriver();
		//wd.findElement(By.xpath(".//*[@id='setupTab']/a")).click();
		wd.findElement(By.cssSelector("#setupTab > a")).click();
		wd.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/h3[10]/span[2]")).click();
		((RemoteWebDriver) wd).findElementByLinkText("Integrations").click();;
		wd.findElement(By.xpath("//*[@id=\"myTabs\"]")).click();;
	}
}


