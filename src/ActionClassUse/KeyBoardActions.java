package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException
	{
		//We have SendKeys(), Arroy_Down, Arroy_Up methods of keyboard.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    WebElement textbox = driver.findElement(By.id("autocomplete"));
	    
	    //textbox.sendKeys("Good Morning"); using webElement method
	    
   //1. How to use sendkey using Action class.
	    
	    //Create object of actions class and pass driver object.
	    
	    Actions act = new Actions(driver);
	    
	    //using sendkeys method of action class perform sendkeys task.
	    
	    act.sendKeys(textbox, "Good Morning").perform();
	    
   //2. How to handle drop down using Actions class.
	    WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
	    
	    //using actions class method Handle drop down.
	    
	    act.click(dropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	    
	    
	}

}
