package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalScrollingUsingXYValues {

	public static void main(String[] args) throws InterruptedException 
	{
		// It is normal scrolling by using x and y values.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(100,800)");
	    

	}

}
