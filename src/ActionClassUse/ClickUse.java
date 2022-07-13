package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    WebElement seleniumButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
        //seleniumButton.click(); --> like that we use directly but we want by using action class.
	    
	    //How to click using Action class.
	    //Create object of Actions class and pass driver object.
	    
	    Actions act = new Actions(driver);
	    
	  //1. first up all we move our cursor on selenium and then click.
//	    act.moveToElement(seleniumButton).perform(); //here only we use one method thats why we use perform() method complusory. 
//	    act.click().perform(); //here also we use only one method.
	    
	  //2. Here we use multiple method at a time
//	    act.moveToElement(seleniumButton).click().build().perform();  //here we use multiple method thats why we use build()method and after perform method. 
	    
	  //3. Directly we click here without moving.
	    act.click(seleniumButton).perform();
	    
	    
	    
	}

}
