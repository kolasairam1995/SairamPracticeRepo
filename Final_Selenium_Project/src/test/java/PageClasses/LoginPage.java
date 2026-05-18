package PageClasses;

import org.openqa.selenium.By;

public class LoginPage {
	
	public static By menuButton()
	{
		return By.cssSelector("[class='fa fa-bars']");
		
	}
	
	public static By loginbtn()
	{
		return By.xpath("//*[text()='Login']");
		
	}
	
	public static By enterUn()
	{
		return By.cssSelector("#txt-username");
		
	}
	
	public static By enterPw()
	{
		return By.cssSelector("#txt-password");
		
	}
	  
	
	public static By submit()
	{
		return By.xpath("//button[@type='submit']");
		
	}
	
	
	
}
