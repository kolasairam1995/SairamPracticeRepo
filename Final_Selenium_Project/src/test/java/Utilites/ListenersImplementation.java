package Utilites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ConstantsData.ConstantData;

public class ListenersImplementation extends BaseClass implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		Reporter.log("Browser opened");
	}

	
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test successful");
	}

	
	public void onTestFailure(ITestResult result) {		
		ITestListener.super.onTestFailure(result);
		
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File trg = new File(ConstantData.Screenshots_path);
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		System.out.println("screenshot captured");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
