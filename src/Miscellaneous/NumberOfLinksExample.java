package Miscellaneous;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinksExample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("q")).sendKeys("Pune University");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("btnK")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[@data-hveid='CAIQBQ']")).click();
	    
	    List<WebElement> images = driver.findElements(By.tagName("img"));
	    
	    //we want only how many images
	    
	    System.out.println(images.size());
//	    //Here we use findElements to find more than 1 things.
//	    System.out.println(links.size());
//	    
//	    Iterator<WebElement> it = images.iterator();
//	    while(it.hasNext())
//	    {
//	    	//System.out.println(it.next()); upto this we can not take because we get link url.
//	    	System.out.println(it.next().getText()); //here we name of links
//	    }
	}

	}


