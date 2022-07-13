package WebDriver;
//WebDriver means this work on browser i.e upper part of browser.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args)
	{
		// 6)this method is use to get title of a webpage.
		// return type of getTitle method is String.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here we first open the tab.
        driver.get("https://web.whatsapp.com/");
        
        //then that open tab we print the title.
        System.out.println(driver.getTitle());
        
        String title = driver.getTitle();
        System.out.println(title);

	}

}
