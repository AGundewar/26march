package TestNGKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultiKeywordsEg {
	 @Test
	  public void d()
	  {
		  Assert.fail(); // this syntex means fail this method 
		  Reporter.log("d is running",true);
	  }
	  
	  @Test(dependsOnMethods = {"d"},priority = -2)
	  public void a()
	  {
		  // if method d is fail means depended method will be skipped.
		  Reporter.log("a is running",true);
	  }
	  
	  @Test
	  public void v()
	  {
		  Reporter.log("v is running",true);
	  }
}
