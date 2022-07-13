package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameMockEg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://ui.vision/demo/webtest/frames/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	   
	    driver.switchTo().frame(2);
	    driver.findElement(By.name("mytext3")).sendKeys("Akshay");
	    
	    driver.switchTo().frame(0);
	    
//	    driver.findElement(By.xpath("(//div[@jsname='WsjYwc'])[1]"));
	    driver.findElement(By.xpath("//span[text()='I am a human']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//span[@dir='auto'])[1]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//span[@dir='auto'])[6]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//span[@dir='auto'])[4]")).click();
	    
	    Thread.sleep(2000);
	    
	   // div d = new 
	   
	//* we move in frame 3.
	    
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(2000);
	    
	//* now we move frame 3 to frame 4.
	    
	    driver.switchTo().frame(3);
	    
	    driver.findElement(By.name("mytext4")).sendKeys("Akshay");
	  
	}

}
