package MockPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.co.in/");
		
		driver.navigate().back();

//		String title = driver.getTitle();
//		System.out.println(title);
	}

}

