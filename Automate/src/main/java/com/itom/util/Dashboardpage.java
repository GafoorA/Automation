package com.itom.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.itom.driverBase.Webdriverbase;

public class Dashboardpage extends Page
{
	public void viewpartnerdashboard()
	{
		Webdriverbase wb=new Webdriverbase();
		WebDriver wd=wb.setdriver("Firefox");
		wd.findElement(By.linkText("Dashboard")).click();
	}
}
 