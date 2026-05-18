package Utilites;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerUtil implements IRetryAnalyzer {

	int retry=3;
	int count=0;
	public boolean retry(ITestResult result) {
		
		if (!result.isSuccess())
		{
			if(count<retry)
			{
			count++;			
			return true;
			}
		}
		
		return false;
	}

	
	
	
	
	
	
	
	
	
	
}
