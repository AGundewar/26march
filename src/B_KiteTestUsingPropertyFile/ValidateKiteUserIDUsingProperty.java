package B_KiteTestUsingPropertyFile;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import B_KiteBaseUsingPropertyFile.BaseNew;
import B_KitePOM.KiteHomePageProperty;
import B_KitePOM.KiteLoginPageProperty;
import B_KitePOM.KitePinPageProperty;
import B_KiteUtilityUsingPropertyFile.UtilityPropertyFile;

public class ValidateKiteUserIDUsingProperty extends BaseNew
{
	KiteHomePageProperty home;
	KiteLoginPageProperty login;
	KitePinPageProperty pin;
	String TCID ="8806";
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		
		login = new KiteLoginPageProperty(driver);
		pin = new KitePinPageProperty(driver);
		home = new KiteHomePageProperty(driver);
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityPropertyFile.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityPropertyFile.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		pin.sendPin(UtilityPropertyFile.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
	}
 
	@Test
    public void ValidateUserID() throws IOException 
	{
		Assert.assertEquals(home.actualUserName(), UtilityPropertyFile.getDataFromPropertyFile("UN"));
		UtilityPropertyFile.captureScreenshot(driver, TCID);
    }
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.clickOnLogoutButton();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
