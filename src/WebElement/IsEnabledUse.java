package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException
	{
		// 5)IsEnabled give output in true or false format.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://www.discoveryplus.in/");
        
        Thread.sleep(50000);
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        
        Thread.sleep(10000);
        
        WebElement GetOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
        System.out.println(GetOTP.isEnabled());
        
        //now give 10digit mobile number.
        driver.findElement(By.id("mobileNumber")).sendKeys("9898989898");
        
        Thread.sleep(5000);
        
        System.out.println(GetOTP.isEnabled());
        
        //we click direct now on OTP button because we have xpath.
        GetOTP.click();
        
	}

}
