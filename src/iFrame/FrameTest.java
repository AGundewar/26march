package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException
	{
		//iFrame it is nothing but the frame on another webpage.
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
         
         Thread.sleep(5000);
         
         driver.switchTo().frame("iframeResult");
         
         driver.findElement(By.xpath("//button[@type='button']")).click();

	}

}
