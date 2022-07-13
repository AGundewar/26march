package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
	
	// Generally method will run to its alphabetical order.
	// By giving Priority we will run which method we wants.
	// Here we have 3 methods and last priority of method is zero(0)
	// So here first priority nu. is given by -2, then -1 and 0.
	
	
  @Test(priority = -5) // if both contain same priority then it follow alphabet order. 
  public void d()
  {
	  Reporter.log("d is running",true);
  }
  
  @Test(priority = -3)
  public void a()
  {
	  Reporter.log("a is running",true);
  }
  
  @Test(priority = -5)
  public void v()
  {
	  Reporter.log("v is running",true);
  }
}
