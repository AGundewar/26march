package TestNGIncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
	
	// include means we have which method we want and other methods we will remove.
	// exclude means we don't want this method and other than this methods we will get.
	
	@Test
	  public void d()
	  {
		  Reporter.log("d is running",true);
	  }
	  
	  @Test(dependsOnMethods = "d")
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
