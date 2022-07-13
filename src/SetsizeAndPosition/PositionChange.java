package SetsizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionChange {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(2000);
	    
	    System.out.println(driver.manage().window().getPosition());  //by using this we know the size of regular page.
	    
	    //to set position we need to create object of point class and pass X and Y coordinate
	    
	    Point p = new Point(200, 10);
	    //using SetPosition method we can set the browser position
	    driver.manage().window().setPosition(p);

	}

}
