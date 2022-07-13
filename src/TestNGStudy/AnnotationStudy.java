package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy{
  @Test
  
  // Here we manually give the @BeforeMethod, @AfterClass etc.
  public void validateUserID()
  {
	  Reporter.log("User ID Validated",true);
  }
  
  @BeforeMethod
  public void loginToKiteApp()
  {
	  Reporter.log("Login successful",true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Browser launched",true);
  }
  
  @AfterMethod
  public void logoutFromKiteApp()
  {
	  Reporter.log("logging out...",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("browser closed",true);
  }
  
  @Test
  public void validateDashBoard()
  {
	  Reporter.log("DashBoard Validated",true);
  }
}
