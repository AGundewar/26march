package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		// Here we takes example of FilpKart.
		// Here popup in the colourful form.
		// we do inspect on that popup.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.name("q")).sendKeys("one plus 10r");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

}
