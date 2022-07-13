package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        //seleniumButton.click(); --> like that we use directly but we want by using action class.
	    
	    //How to right click (contentClick) using Action class.
	    //Create object of Actions class and pass driver object.
	    
	    Actions act = new Actions(driver);
	    
	    //here also we use 3 ways to right click the button.
	    
	    //act.moveToElement(rightClickButton).contextClick().build().perform();

	    act.contextClick(rightClickButton).perform();
	}

}
