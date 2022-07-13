package PopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserEx {

	public static void main(String[] args) throws InterruptedException 
	{
		// 3 times open child browser and return to main browser.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://www.w3schools.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();

	    Thread.sleep(2000);
	    
	    //to handle multiple windows we use getWindowHandles() method.
	    //here we get multiple ids.
	    
	    Set<String> allPageIDs = driver.getWindowHandles();
	    
	    Iterator<String> it = allPageIDs.iterator();
	    
//	    while(it.hasNext())
//	    {
//	    	System.out.println(it.next());
//	    }
	    String mainPageId = it.next(); //will return main page id
	    String childPageId = it.next(); //will return child page id
	    
    //1. to switch focus to child window
	    
	    driver.switchTo().window(childPageId); //changing focus from main page to child page.
        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	    
        Thread.sleep(2000);
	    
	    driver.switchTo().window(mainPageId);
	    
	    Thread.sleep(2000);
	    
    //2. ToSwitch focus to another child browser.
	    
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[2]")).click();

	    Thread.sleep(2000);
	    
	    //to handle multiple windows we use getWindowHandles() method.
	    //here we get multiple ids.
	    
	    Set<String> allPageIDs1 = driver.getWindowHandles();
	    
	    Iterator<String> it1 = allPageIDs1.iterator();
	    
//	    while(it.hasNext())
//	    {
//	    	System.out.println(it.next());
//	    }
	    String mainPageId1 = it1.next(); //will return main page id
	    String childPageId1 = it1.next(); //will return child page i    
	    
        driver.switchTo().window(childPageId1); //changing focus from main page to child page.
        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	    
        Thread.sleep(2000);
	    
	    driver.switchTo().window(mainPageId1);
	    
	    Thread.sleep(2000);
	    
	//3. ToSwitch focus to another child browser.
	    
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[3]")).click();

	    Thread.sleep(2000);
	    
	    //to handle multiple windows we use getWindowHandles() method.
	    //here we get multiple ids.
	    
	    Set<String> allPageIDs2 = driver.getWindowHandles();
	    
	    Iterator<String> it2 = allPageIDs2.iterator();
	    
//	    while(it.hasNext())
//	    {
//	    	System.out.println(it.next());
//	    }
	    String mainPageId2 = it2.next(); //will return main page id
	    String childPageId2 = it2.next(); //will return child page i
	    
        driver.switchTo().window(childPageId2); //changing focus from main page to child page.
        
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	    
        Thread.sleep(2000);
	    
	    driver.switchTo().window(mainPageId2);
	    
	    Thread.sleep(2000); 
	    
	 // Lastly we close all the tabs.
	    
	    driver.quit();
	    
	    
	    
	}

}
