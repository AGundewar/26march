package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamleOfScrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		// We move to that text then put the value in that.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    // we move upto radio button first then click on radio2 and send message Hello Guys.
	    WebElement radio = driver.findElement(By.id("autocomplete"));

	    JavascriptExecutor je = (JavascriptExecutor)driver;
	    
	    je.executeScript("arguments[0].scrollIntoView(true)",radio);
	    
	    //Now we click on radio 
	    
	    Thread.sleep(2000);
	    driver.findElement(By.name("radio")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("autocomplete")).sendKeys("Hello Guys");
	    
	    //now we scroll down on next element.
	    
	    WebElement switchElement = driver.findElement(By.id("name"));
	    je.executeScript("arguments[0].scrollIntoView(true)", switchElement);
	    
	    
	    
	    
	    
	}

}
