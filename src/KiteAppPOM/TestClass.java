package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException
	{
		// Here we execute the login page.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);

	    KiteLoginPage login = new KiteLoginPage(driver);
	    login.sendUserName();
	    login.sendPassword();
	    login.clickOnLoginButton();
	    
	    //Here we move from one page to another page then always give thread.
	    Thread.sleep(2000);
	    
	    KitePinPage pinPage = new KitePinPage(driver);
	    pinPage.sendPin();
	    pinPage.clickOnContinueButton();
	    
	    //Here we move again another page.
	    Thread.sleep(2000);
	    
	    KiteHomePage home = new KiteHomePage(driver);
	    home.validateUserName();
	    home.clickOnLogoutButton();
	    
	    //Now we closing the application.
	    driver.close();
	    

	}

}
