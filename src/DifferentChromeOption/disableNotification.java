package DifferentChromeOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disableNotification {

	public static void main(String[] args) throws InterruptedException 
	{
		// Here we hide the pop up that are coming .
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    ChromeOptions opt = new ChromeOptions();
	    // and in webdriver object pass the parameter as opt
	    // and which method we want call here from ChromeOption
	    opt.addArguments("disable-notifications");
	    
		WebDriver driver = new ChromeDriver(opt);
	        
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("userid")).sendKeys("DAA677");
	    driver.findElement(By.id("password")).sendKeys("Velocity@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("Click on loginButton");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("pin")).sendKeys("866918");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("Click on Continu Button");

	}

}
