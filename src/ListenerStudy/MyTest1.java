package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import TestNGKeyWords.DependsOnMethodUse;

@Listeners(ListenerStudy.Listerner.class)
public class MyTest1 
{
  @Test
  public void TC1()
  {
	  Reporter.log("TC1 Running succesfully",true);
  }
  
  @Test
  public void TC2()
  {
	  Assert.fail();
	  Reporter.log("TC2 Failed",true);
  }
  
  @Test(dependsOnMethods = "TC2")
  public void TC3()
  {
	  Reporter.log("TC3 Skipped",true);
  }
}
