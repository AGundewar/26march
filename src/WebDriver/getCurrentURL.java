package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL {

	public static void main(String[] args) 
	{
		// 7)This method is use to get URL of a webpage.
		// Return type of getCurrentURL method is String.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here first open the tab
        driver.get("https://www.linkedin.com/");
        
        System.out.println(driver.getCurrentUrl()); 
        
        String url = driver.getCurrentUrl();
        System.out.println(url);

	}

}
