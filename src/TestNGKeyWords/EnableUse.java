package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
	
	// If we do not want any method or skip that method we use enable keywords.
	// But in early/past we directly comment that method to skip.
	
	 @Test
	  public void d()
	  {
		  Reporter.log("d is running",true);
	  }
	  
	 // false means this method is not their in our class.
	  @Test(enabled = false)
	  public void a()
	  {
		  Reporter.log("a is running",true);
	  }
	  
	// it means method is other but you write false then we skip that method.
	  @Test(enabled = true)  
	  public void v()
	  {
		  Reporter.log("v is running",true);
	  }
}
