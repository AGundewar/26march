package CrossBrowserOfPropertyFileUsingListener;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

//import A_KiteUtility.Utility;
import B_KiteUtilityUsingPropertyFile.UtilityPropertyFile;

public class BaseCross
{
	protected WebDriver driver;
	
	public void openBrowserChrome() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("disable-notifications");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(UtilityPropertyFile.getDataFromPropertyFile("URL"));
		Reporter.log("Launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	public void openBrowserFirefox() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\geckodriver.exe");
		  // WebDriver driver = new FirefoxDriver(); this things we declear globally.   
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        driver.get(UtilityPropertyFile.getDataFromPropertyFile("URL"));
		Reporter.log("Launching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
