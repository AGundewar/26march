package WebDriver;
//WebDriver means this work on browser i.e upper part of browser.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

	public static void main(String[] args) throws InterruptedException
	{
		// 5)This method is use to open an application, 
		// move forward, move backward & refresh the web-page.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        // We open 1 application.
        driver.get("https://www.amazon.in/"); 
      
        // now we want to navigate to another application.
        driver.navigate().to("https://www.myntra.com/"); //This is webdriver method.
        
        // now we want back into amazon.
        driver.navigate().back();
        
        // now again we forward to myntra.
        driver.navigate().forward();
        
        Thread.sleep(2000); //you pausing the selenium tool.
        
        // we want to refresh the page.
        driver.navigate().refresh();
	}

}
