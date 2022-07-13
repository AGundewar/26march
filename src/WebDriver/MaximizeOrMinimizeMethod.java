package WebDriver;
//WebDriver means this work on browser i.e upper part of browser.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeOrMinimizeMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		//4)Maximize & Minimize method use for Maximize the tabs and then minimize in browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // First we open any tab.
        driver.get("https://www.facebook.com/");
		
        Thread.sleep(2000); //Thread means we pose for some time
        
        // This open tab we Minimize first .
        driver.manage().window().minimize();
        
        Thread.sleep(2000); //Here pose for 2 sec.
		        
        // Now we Maximize the tab.
	    driver.manage().window().maximize();
	    //Maximize mean full open tab

	}

}
