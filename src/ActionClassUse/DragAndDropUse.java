package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    //Find Source and Destination.
	    WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
	    
	    WebElement destination = driver.findElement(By.id("amt8"));
        
	    
	    //How to Drag and Drop using Action class.
	    //Create object of Actions class and pass driver object.
	    
	    Actions act = new Actions(driver);

	    //by using actions class methods perform desired action.
	    
//	    act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
	    
	    //we have direct method for this is drag and drop.
	    act.dragAndDrop(source, destination).perform();
	}

}
