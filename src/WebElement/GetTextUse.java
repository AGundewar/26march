package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) throws InterruptedException
	{
		// 4)in getText we get printing value in console window.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/selenium/practice.html");
         
        Thread.sleep(2000);
        
        //First type to write printing statement.
        System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());

        //Second type to write printing statement.
        String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
        System.out.println(text);
        
        //Third type to write printing statement.
        WebElement element = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
        System.out.println(element.getText());
	}

}
