package Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		//This wait use how many time he required.
		//this wait not take all time that we given.
		//eg. 2000ms --> 100ms takes --> 1900ms release wait time.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	        
	    //Thread.sleep(2000); --> this we cannot use here.
	    
	    //Implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    //If this take only 1sec then remaining 9sec will be release.
	    
	    driver.close();

	}

}
