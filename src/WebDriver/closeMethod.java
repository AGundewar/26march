package WebDriver;
//WebDriver means this work on browser i.e upper part of browser.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod 
{

	public static void main(String[] args)
	{
		// 2) To close the current tab of browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	       
	    // First we open the tab .
        driver.get("https://paytm.com/");
        
        // Now we close this open tab.
        driver.close(); //This is webdriver method
	}


}

