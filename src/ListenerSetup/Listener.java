package ListenerSetup;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
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
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC is skipped check depandency tc name is "+result.getName(),true);
	}

}
