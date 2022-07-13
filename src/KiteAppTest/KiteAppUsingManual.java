package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingManual {

	public static void main(String[] args) throws InterruptedException
	{
		// Here we put all by manual .
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    WebElement userID = driver.findElement(By.id("userid"));
	    WebElement passWord = driver.findElement(By.id("password"));
	    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

	    userID.sendKeys("ELR321");
	    Thread.sleep(500);
	    passWord.sendKeys("Dhana1111");
	    Thread.sleep(500);
	    loginButton.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement pin = driver.findElement(By.id("pin"));
	    WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    
	    pin.sendKeys("982278");
	    Thread.sleep(500);
	    continueButton.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
	    
	    String actualUserId = userName.getText();
	    String expectedUserId = "ELR321";
	    
	    if(actualUserId.equals(expectedUserId))
	    {
	    	System.out.println("User ID matching TestCase is PASSED.");
	    }
	    else
	    {
	    	System.out.println("User ID not matching TestCase is FAILED.");
	    }
	    
	    Thread.sleep(2000);
	    
	    userName.click();
	    Thread.sleep(500);
	    
	    driver.findElement(By.xpath("//a[@target='_self']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.close();

	    
	}

}
