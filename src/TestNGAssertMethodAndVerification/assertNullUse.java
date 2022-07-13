package TestNGAssertMethodAndVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNullUse {
  @Test
  public void project()
  {
	  //this will in the form of string.
	  String a = null;
	  String b = "abc";
	  
	  Assert.assertNull(a, "value is not null, TC is failed");
	  Reporter.log("value is null, TC is passed",true);
  }
  
  @Test
  public void project1()
  {
	  //this will in the form of string.
	  String a = null;
	  String b = "abc";
	  
	  Assert.assertNull(b, "value is not null, TC is failed");
	  Reporter.log("value is null, TC is passed",true);
  }
}
