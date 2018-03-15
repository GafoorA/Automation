package com.itom.test;

import org.testng.annotations.Test;

import com.itom.driverBase.Webdriverbase;
import com.itom.util.Dashboardpage;
import com.itom.util.LoginPage;
import com.itom.util.SetupPage;

public class MasterTest extends Webdriverbase implements Runnable
{
	@Test
	public void run() 
	{
		
		LoginPage lgp=new LoginPage();
		lgp.bothcorrectCred();
		/*Dashboardpage dp=new Dashboardpage();
		dp.viewpartnerdashboard();*/
		
	}
}
