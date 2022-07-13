package ListenerBrowserWork;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 extends BaseLi1 implements ITestListener
{
	//Create object of base class.
	BaseLi1 bl = new BaseLi1();
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Test case passed Successfully",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		String TCID = result.getName();
		Reporter.log("Test case failed, take screenshot"+TCID+"",true);
		try {
			bl.captureScreenshot(TCID);
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
			
		
	}
	

}
