package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import PageClasses.LoginPage;
import PageClasses.Logout;
import Utilites.BaseClass;

public class LogoutTest extends BaseClass {

	
	@Test (groups="smoke", priority=4)
	public void logout() throws IOException
	{
		LoginTest.loginapp();
		driver.findElement(LoginPage.menuButton()).click();
		driver.findElement(Logout.logoutApp()).click();		
	}
	
	
	
	
	
	
	
}
