package DifferentChromeOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {

	public static void main(String[] args) throws InterruptedException
	{
		// Headless means without launching browser we get output.
		// and browser run in selenium this will be hide and only we get output 
		
		// for using headless we create object of ChromeOption after System.setProperty
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    ChromeOptions opt = new ChromeOptions();
	    // and in webdriver object pass the parameter as opt
	    // and which method we want call here from ChromeOption
	    opt.addArguments("headless");
	    
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
