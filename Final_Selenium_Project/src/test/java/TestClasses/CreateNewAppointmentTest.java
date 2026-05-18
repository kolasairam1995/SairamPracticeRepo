package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.BookAppointmentPage;
import PageClasses.CreateNewAppointmentPage;
import Utilites.BaseClass;
import Utilites.ListenersImplementation;

@Listeners(ListenersImplementation.class)
public class CreateNewAppointmentTest extends BaseClass{

	@DataProvider(name="dp")
	public Object[][] appoint()
	{
		return new Object[][]
				{
			{"20/04/2026","Consult Dentist"}, {"25/04/2026","Consult Physician"}
				};
	}
	
	
	
	@Test(dataProvider="dp", groups="smoke", retryAnalyzer=Utilites.RetryAnalyzerUtil.class, priority=2)
	public static void book(String date, String reason) throws IOException
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
		
		boolean b1 = driver.findElement(CreateNewAppointmentPage.confirmation1()).isDisplayed();
		boolean b2 = driver.findElement(CreateNewAppointmentPage.confirmation2()).isDisplayed();

        if(b1==true & b2==true)
        {
        	System.out.println("appointment booked");
        }
		
		BaseClass.scrollup();
		driver.findElement(BookAppointmentPage.mainbook()).click();
	}
	
	
	
	
	
	
	
	
}
