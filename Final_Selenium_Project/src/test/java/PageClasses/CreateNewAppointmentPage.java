package PageClasses;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;

public class CreateNewAppointmentPage {

	
	public static By facility()
	{
		return By.cssSelector("[name='facility']");
	}
	
	
	public static By applyBox()
	{
		return By.cssSelector("[value='Yes']");
	}
	
	
	public static By program()
	{
		return By.cssSelector("[ value='Medicare']");
	}
	
	
	public static By date()
	{
		return By.cssSelector("[name='visit_date']");
	}
	
	
	public static By comment()
	{
		return By.cssSelector("[name='comment']");
	}
	
	
	public static By bookAppoint()
	{
		return By.xpath("//*[text()='Book Appointment']");
	}
	
	
	 public static By confirmation1()
	 {
		 return By.xpath("//*[contains(text(),'Appointment ')]");
	 }
	
	
	 public static By confirmation2()
	 {
		 return By.xpath("//*[contains(text(),'Please')]");
	 }
	
	 
	 
	 
	 
	
}
