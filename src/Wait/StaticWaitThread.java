package Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWaitThread {

	public static void main(String[] args) throws InterruptedException 
	{
		//Here we give Static wait that is Synchronize wait.
		// This wait is not dynamic i.e means he take that much time compulsary.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	     
	    //this is static wait
	    Thread.sleep(2000);


	}

}
