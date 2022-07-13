package A_KiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
	// Now again we update the TestNG by creating different different browser.
	
	protected WebDriver driver;
			
	public void openBrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			// WebDriver driver = new ChromeDriver(); this we use multiple time thats why it is declear globally.
			 ChromeOptions opt = new ChromeOptions();
			 opt.addArguments("disable-notification");
			 
			 driver = new ChromeDriver(opt);
		     driver.get("https://kite.zerodha.com/");
	         driver.manage().window().maximize();
	         
	         Reporter.log("Launching browser",true);
	         // after we move any other page we give wait.
	         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));		
	}

}
