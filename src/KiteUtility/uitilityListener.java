package KiteUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class uitilityListener extends Uitility implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("welcome TC is pass tc name is "+ result.getName(),true);
		
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is faile tc name is "+ result.getName(),true);
		try {
			Uitility.pickScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
