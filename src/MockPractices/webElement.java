package MockPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(5000);
		WebElement OTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));

		System.out.println(OTP.isEnabled());
		
		driver.findElement(By.name("mobileNumber")).sendKeys("9898989898");
		
		System.out.println(OTP.isEnabled());
		
		

	}

}
