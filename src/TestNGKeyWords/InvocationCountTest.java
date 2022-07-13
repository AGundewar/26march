package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountTest {
	//Here one method we have to run multiple times.
    // And infront of @Test we write (invocationCount = anynumber)
	
	@Test(invocationCount = 5) //this will run 5 times.
    public void myTest()
    {
		Reporter.log("My",true);
    }
	
	@AfterMethod  //His also run 5 times because sequence is @Test then @AfterMethod & here Test will run 5 times thats way afterMethod also run 5 times.
	public void test()
	{
		Reporter.log("Friends",true);
	}
	
	@BeforeMethod   //His also run 5 times because sequence is @BefterMethod then @Test & here Test will run 5 times thats way befterMethod also run 5 times.
	public void test1()
	{
		Reporter.log("Hello",true);
	}
}
