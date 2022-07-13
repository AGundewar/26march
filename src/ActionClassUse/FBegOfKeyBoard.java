package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FBegOfKeyBoard {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Create New Account")).click();
	    
	    Thread.sleep(2000);
	    
	    WebElement day = driver.findElement(By.id("day"));
	    
	    Actions act = new Actions(driver);
	    
	    act.click(day).perform();
	    
  //1.  we want to clink on 20th day and todays day is 12 so we move again 8 days to go our destination. 
	    
	    for(int i=1; i<=8; i++)
	    {
	    	act.sendKeys(Keys.ARROW_DOWN).perform();
	    	 Thread.sleep(2000);
	    }
	    act.sendKeys(Keys.ENTER).perform();
	    
  //2.  We want now Name Akshay where first letter capital.
	    
	    WebElement firstname = driver.findElement(By.name("firstname"));
	    
	    act.keyDown(firstname, Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).sendKeys("kshay").build().perform();
	    

	}

}
