package TestNGAssertMethodAndVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrueUse {
  @Test
  public void test() 
  {
	  //True means boolean.
	  boolean a = true;
	  boolean b = false;
	  
	  Assert.assertTrue(a, "TC is failed, value is false");
	  Reporter.log("TC is passed, value is true",true);
  }
  
  @Test
  public void test1() 
  {
	  //True means boolean.
	  boolean a = true;
	  boolean b = false;
	  
	  Assert.assertTrue(b, "TC is failed, value is false");
	  Reporter.log("TC is passed, value is true",true);
  }
}
