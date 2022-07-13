package ListenerBrowserWork;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseLi1 
{
	static WebDriver driver;
	public void browserInitialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	        
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    
	 }
	
	public void captureScreenshot(String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\ScreenShot\\Akshay1"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	
}
