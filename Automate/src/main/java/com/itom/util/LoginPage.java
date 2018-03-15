package com.itom.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.itom.driverBase.Webdriverbase;

public class LoginPage extends Page
{
       public WebElement uname,upass,lgnbtn;
   
	public void bothcorrectCred()
	{
		Webdriverbase wb=new Webdriverbase();
		WebDriver wd=wb.setdriver("Firefox");
		wd.navigate().to("https://sjchc-trunk.vistara.it");
		wd.findElement(By.id("username")).sendKeys("gafoor1");
		wd.findElement(By.id("password")).sendKeys("pass@123");
		wd.findElement(By.id("login_submit")).click();
		/*//wd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		@SuppressWarnings("unused")
		WebDriverWait wait=new WebDriverWait(wd, 30);*/
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wd.findElement(By.cssSelector("#setupTab > a")).click();
		wd.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/h3[10]/span[2]")).click();
		wd.findElement(By.xpath("//*[@id='discovery-section']/span[2]")).click();
		wd.findElement(By.xpath("//*[@id='appIntegrations']/a")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.findElement(By.id("avilableCount")).click();
		wd.findElement(By.xpath("//*[@id='element_0']/a")).click();
		wd.findElement(By.xpath("//*[@id='appsLoad']/div/li[1]/div[2]/span/img")).click();
	}
}



