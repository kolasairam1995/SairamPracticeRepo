package PageClasses;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;

public class BookAppointmentPage {

	
	
	public static By hist()
	{
		return By.xpath("//*[text()='History']");
	}
	
	
	public static By count()
	{
		return By.cssSelector("[class='panel-heading']");
	}
	
	public static By reason1()
	{
		return By.xpath("(//*[@id='comment'])[1]");
	}
	
	
	public static By reason2()
	{
		return By.xpath("(//*[@id='comment'])[2]");
	}
	
	
	public static By mainbook()
	{
		return By.xpath("//*[contains(@id,'btn-mak')]");
		
	}
	
	
	
	
	
	
	
}
