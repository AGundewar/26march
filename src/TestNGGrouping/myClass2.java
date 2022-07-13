package TestNGGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myClass2 {
	
	// If we have 3 or 4 sanity testing and 3 or 4 regression testing 
	// then in xml file what we do
	// by combine myClass1 and myClass2
	
	  @Test(groups = {"sanity"})
	  public void p()
	  {
		  Reporter.log("p is running,sanity",true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void q()
	  {
		  Reporter.log("q is running,regression",true);
	  }
	  
	  @Test(groups = {"sanity"})
	  public void r()
	  {
		  Reporter.log("r is running,sanity",true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void s()
	  {
		  Reporter.log("s is running,regression",true);
	  }
	}