package Miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException
	{
		// here we want
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("q")).sendKeys("Honda");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));

	    System.out.println(searchResult.size());
	    
	    //By using for each method
	    for(WebElement r:searchResult)  //for getting text only
	    {
	    	System.out.println(r.getText());
	    }
	    
	    Thread.sleep(3000);
	    
	    
	    //for clicking on required result
	    for(WebElement sr:searchResult)
	    {
	    	String actualText = sr.getText();
	    	String expectedText ="honda amaze";
	    	
	    	Thread.sleep(2000);
	    	
	    	if(actualText.equals(expectedText))
	    	{
	    		sr.click();
	    		break;
	    	}
	    }
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.linkText("Images")).click(); //why?
	    
	    
	}

}
