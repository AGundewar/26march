package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectviewByScrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		// Here we get what we want.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    WebElement chinchwad = driver.findElement(By.xpath("//strong[text()='Chinchwad Branch']"));
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0].scrollIntoView(true)",chinchwad);


	}

}
