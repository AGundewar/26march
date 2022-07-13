package WebDriver;
//WebDriver means this work on browser i.e upper part of browser.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) 
	{
		//1)get method use for open an application (or) to enter url in browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/"); //This is webdriver method
	}

}
