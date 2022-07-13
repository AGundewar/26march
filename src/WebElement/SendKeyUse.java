package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUse {

	public static void main(String[] args)
	{
		// 1)Sendkey method is use to entre value in the text field.
		// sendKeys use to write some thing in context.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/selenium/practice.html");
        
        driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Good Night");

	}

}
