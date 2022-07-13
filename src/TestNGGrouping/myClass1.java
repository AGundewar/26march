package TestNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myClass1 {
	// If we have 3 or 4 sanity testing and 3 or 4 regression testing 
	// then in xml file what we do
	// by combine myClass1 and myClass2
	
  @Test(groups = {"sanity"})
  public void a()
  {
	  Reporter.log("a is running,sanity",true);
  }
  
  @Test
  public void b()
  {
	  Reporter.log("b is running",true);
  }
  
  @Test(groups = {"regression"})
  public void c()
  {
	  Reporter.log("c is running,regression",true);
  }
  
  @Test(groups = {"sanity"})
  public void d()
  {
	  Reporter.log("d is running,sanity",true);
  }
}
