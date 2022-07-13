package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitORWebDriverWait {

	public static void main(String[] args)
	{
		// Here we cannot load all the webpage only we load upto which element we want.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com");
	    driver.manage().window().maximize();
	        
	    //Thread.sleep(2000);
	    
	    //Explicit Wait.
	    //only load which element we want.
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));

	    WebElement aboutUs = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
	
	    wait.until(ExpectedConditions.visibilityOf(aboutUs));
	    aboutUs.click();
	}

}
