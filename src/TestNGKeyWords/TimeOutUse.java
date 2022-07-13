package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
	
	// If any method take maximum time to run 
	// at that we declear time to that method if in that time
	//this method not run then we fail that method and move to another method
	 
	@Test(timeOut = 1000)
      public void d() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  Reporter.log("d is running",true);
	  }
	  
	  @Test
	  public void a()
	  {
		  Reporter.log("a is running",true);
	  }
	  
	  @Test
	  public void v()
	  {
		  Reporter.log("v is running",true);
	  }
}
