package B_KiteBaseUsingPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

//import A_KiteUtility.Utility;
import B_KiteUtilityUsingPropertyFile.UtilityPropertyFile;

public class BaseNew
{
	protected WebDriver driver;
	
	public void openBrowser() throws IOException
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

}
