package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	
	// Here method run in alphabetical order but method a is depends on method d 
	// thats why first run method d and method a run at last.
	
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
