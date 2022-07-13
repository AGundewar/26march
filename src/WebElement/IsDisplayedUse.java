package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException
	{
		//7) It show hidden value display or not.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/selenium/practice.html");
        
        Thread.sleep(2000);
        
        WebElement hide = driver.findElement(By.id("hide-textbox"));
        WebElement show = driver.findElement(By.id("show-textbox"));
        WebElement textbox = driver.findElement(By.name("show-hide"));
        
        if(textbox.isDisplayed())
        {
        	System.out.println("Thank you textbox is displayed.");
        }
        else
        {
        	System.out.println("Cant find textbox.");
        }
        
        hide.click();
        
        if(textbox.isDisplayed())
        {
        	System.out.println("Thank you textbox is displayed.");
        }
        else
        {
        	System.out.println("Cant find textbox.");
        }
        

	}

}
