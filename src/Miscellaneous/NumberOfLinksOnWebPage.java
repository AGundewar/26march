package Miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException
	{
		// Here we count number of links on webpage which have tagname a always.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    //Here we use findElements to find more than 1 things.
	    System.out.println(links.size());
	    
	    Iterator<WebElement> it = links.iterator();
	    while(it.hasNext())
	    {
	    	//System.out.println(it.next()); upto this we can not take because we get link url.
	    	System.out.println(it.next().getText()); //here we name of links
	    }
	}

}
