package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickUse {

	public static void main(String[] args) throws InterruptedException
	{
		// 3)click method use for click the option or radio button.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/selenium/practice.html");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@value='Radio3']")).click();

	}

}
