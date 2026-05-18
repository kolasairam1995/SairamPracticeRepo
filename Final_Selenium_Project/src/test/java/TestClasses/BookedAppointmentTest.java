package TestClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.BookAppointmentPage;
import PageClasses.CreateNewAppointmentPage;
import PageClasses.LoginPage;
import Utilites.BaseClass;
import junit.framework.Assert;

public class BookedAppointmentTest extends BaseClass{

	@DataProvider(name="Book")
	public Object[][] book()
	{
		return new Object[][]
	 {
			{"27/05/2026", "consult for dematologist"},{"28/05/2026","consult for physio"} 
	 };
	}
	
	// To run from Test class uncomment below code
//	@BeforeClass(alwaysRun = true)
//	public void appLogin() throws IOException
//	{
//	    LoginTest.loginapp();
//	}

	
	@Test(dataProvider="Book", groups="smoke", priority=3)
	public void bookConsult(String date, String reason) throws IOException, InterruptedException
	{    
		LoginTest.loginapp();
		WebElement e = driver.findElement(CreateNewAppointmentPage.facility());
		Select s = new Select(e);
		s.selectByIndex(0);		
		driver.findElement(CreateNewAppointmentPage.applyBox()).click();
		driver.findElement(CreateNewAppointmentPage.program()).click();		
		driver.findElement(CreateNewAppointmentPage.date()).sendKeys(date);
		driver.findElement(CreateNewAppointmentPage.comment()).sendKeys(reason);		
		driver.findElement(CreateNewAppointmentPage.bookAppoint()).click();
//		BaseClass.scrollup();
//		driver.findElement(BookAppointmentPage.mainbook()).click();	
		driver.findElement(LoginPage.menuButton()).click();
		driver.findElement(BookAppointmentPage.hist()).click();
		Thread.sleep(3000);
		boolean b =driver.findElement(BookAppointmentPage.reason1()).isDisplayed();
		System.out.println("Appointment confirmed"); 
	}
		
		
		
//		@Test (groups="smoke", priority=4)
//        public void validateBooking()
//        {
//		driver.findElement(LoginPage.menuButton()).click();
//		driver.findElement(BookAppointmentPage.hist()).click();
//		List<WebElement> li = driver.findElements(BookAppointmentPage.count());
//	    int x = li.size();
//	    if(x==4)
//	    {
//	    	System.out.println("Appointment successfully booked for 2 customers");
//	    }
//	BaseClass.scrolldown();
//	String r1=driver.findElement(BookAppointmentPage.reason1()).getText();
//	String r2=driver.findElement(BookAppointmentPage.reason2()).getText();
//
//	Assert.assertEquals("consult for dematologist", r1);
//	Assert.assertEquals("consult for physio", r2);
//
//        }
	
	}
	
	
	
	
	
	
	
	
	

