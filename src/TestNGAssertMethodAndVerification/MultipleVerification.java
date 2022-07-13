package TestNGAssertMethodAndVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void method() 
  {
	  String a = "Pune";
	  String b = "Pune1";
	  
	  Assert.assertNotEquals(a, b, "TC is failed values are equal");
	  
	  Assert.assertNotNull(b, "TC is failed value is null");
	  
	  // By using Hard Assert,
	  // It checks only one method at a time, and not run multiple method.
	  
	  // so for running multiple method we use Soft Assert
  }
}
