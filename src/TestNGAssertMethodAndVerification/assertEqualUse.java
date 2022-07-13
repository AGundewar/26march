package TestNGAssertMethodAndVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertEqualUse {
  @Test
  public void myMethod()
  {
	  String a = "Pune";
	  String b = "Pune";
	  
	  //when TC is failed then assert default statement will be run.
	  Assert.assertEquals(a,b,"a and b values are not matching TC failed");
	  //and when TC is pass then reporter default statement will be run.
	  Reporter.log("a and b values are matching TC PASSED",true);
   }
  
  @Test
  public void myMethod1()
  {
	  String a = "Pune";
	  String b = "Nagpur";
	  
	  //when TC is failed then assert default statement will be run.
	  Assert.assertEquals(a,b,"a and b values are not matching TC failed");
	  //and when TC is pass then reporter default statement will be run.
	  Reporter.log("a and b values are matching TC PASSED",true);
   }
  
}
