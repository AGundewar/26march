package WebDriver;
//WebDriver means this work on browser i.e upper part of browser.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitMethod {

	public static void main(String[] args)
	{
		//3)quit method use for close all the tabs present in browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        // First we open the tab .
        driver.get("https://www.flipkart.com/");
        
        // Now we quit this open tab.
        driver.quit(); //This is webdriver method

	}

}
