package CrossBrowserOfPropertyFileUsingListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerProp extends BaseCross implements ITestListener
{
	//Create object of base class.
	BaseCross bl = new BaseCross();
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Test case passed Successfully",true);
	}
	
	
		
			
		
}
	


