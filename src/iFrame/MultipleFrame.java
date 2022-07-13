package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleFrame {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	        
	        String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
	        System.out.println(text);
	        
	     // Main page to frame1 (i.e topic frame).
	        driver.switchTo().frame("frame1");
	        driver.findElement(By.xpath("//input[1]")).sendKeys("Hello Everyone.");
	        
	     // frame1 to inner frame i.e frame3.
	        driver.switchTo().frame("frame3");
	        driver.findElement(By.id("a")).click();
	        
	        // now we directly moves from frame3 to main page by using default content.
	     // frame3 to Main page.
	        driver.switchTo().defaultContent();
	        String text1 = driver.findElement(By.xpath("//label[@style='font-size:40px']")).getText();
	        System.out.println(text1);
	        
	     // Main frame to another frame i.e frame2.
	        driver.switchTo().frame("frame2");
	        WebElement name = driver.findElement(By.id("animals"));
	        
	        //we create select class.
	        Select s = new Select(name);
	        s.selectByIndex(2);
	        Thread.sleep(1000);
	        s.selectByValue("cat");
	        Thread.sleep(1000);
	        s.selectByVisibleText("Avatar");
	        
	        
	        
	        
	        
	        
	        
	        
	        

	}

}
