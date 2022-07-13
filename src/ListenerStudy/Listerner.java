package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

// In without main method also we can execute 

public class Listerner implements ITestListener 
{
	@Override
	public void onTestSuccess(ITestResult result)
	{
		// This all methods of ITestListerner
		
		Reporter.log("Test case passed Successfully",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test failed take screenshot",true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
	    Reporter.log("This test is skipped",true);
	}

}
