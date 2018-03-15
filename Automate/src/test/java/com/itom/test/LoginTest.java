package com.itom.test;
import org.testng.annotations.Test;

import com.itom.driverBase.Webdriverbase;
import com.itom.util.LoginPage;

public class LoginTest extends Webdriverbase
{
	@Test
	public void call()
	{
		LoginPage lgp=new LoginPage();
		lgp.bothcorrectCred();
	}
	
	
}
