package TestNGAssertMethodAndVerification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SOFTaSSERTuSE {
  @Test
  public void allMethods() 
  {
	  //Soft assert will be run all methods if any method is then also.
	  
	  String a = "abc";
	  String b = "abc";
	  
	  // To use soft assert we need to create object of SoftAssert class.
	  
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertEquals(a, b, "Both are not equal TC is failed");
	  soft.assertNotEquals(a, b, "Both are equal TC is failed");
	  soft.assertNull(b, "Value is not null, TC is failed");
	  soft.assertNotNull(a, "Value is null, TC is failed");
	  
	  // For running this all method at the last we write soft.assertAll();
	  // This is complusary.
	  
	  soft.assertAll();
  }
  
  @Test
  public void testing()
  {
	  boolean a = true;
	  boolean b = false;
	  
	  SoftAssert s = new SoftAssert();
	  
	  s.assertTrue(a, "Value is False TC is failed");
	  s.assertTrue(b, "Value is False TC is failed");
	  s.assertFalse(a, "Value is True TC is failed");
	  
	  s.assertAll();
  }
}
