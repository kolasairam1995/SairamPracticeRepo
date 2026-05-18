package TestClasses;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import Utilites.BaseClass;
import Utilites.FetchDataFromExcel;
import Utilites.ListenersImplementation;

@Listeners(ListenersImplementation.class)
public class LoginTest extends BaseClass{

	@Test(priority=1, groups="smoke")
	public static void loginapp() throws IOException
	{  
		
		driver.findElement(LoginPage.menuButton()).click();
		driver.findElement(LoginPage.loginbtn()).click();
		BaseClass.scrolldown();
		driver.findElement(LoginPage.enterUn()).sendKeys(FetchDataFromExcel.getDataFromExcel(1, 0));
		driver.findElement(LoginPage.enterPw()).sendKeys(FetchDataFromExcel.getDataFromExcel(1, 1));
		driver.findElement(LoginPage.submit()).click();
		
	 
		
		
	}
	
	
	
	
	
	
	
	

}
