package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearUse {

	public static void main(String[] args) throws InterruptedException
	{
		// 2)Clear method is use to clear value in the text field.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/selenium/practice.html");
        
        //here write some thing by using sendkey.
        driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Good Night");
	
        Thread.sleep(2000);
        
        //Now we clear that content by using clear element.
        driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).clear();
	}

}
