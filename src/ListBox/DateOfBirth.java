package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {

	public static void main(String[] args) throws InterruptedException
	{
		//We find date of birth in facebook sing up page.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Open the facebook sign up page.
        driver.get("https://www.facebook.com/");
        
        Thread.sleep(2000);
		
        driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
   //1) For Day.
        WebElement day = driver.findElement(By.name("birthday_day"));
        Select d = new Select(day);
        //d.selectByVisibleText("19");
        d.selectByValue("19");
        //d.selectByIndex(18);
        
   //2) For Month.
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select m = new Select(month);
        //m.selectByVisibleText("Jul");
        //m.selectByValue("7");
        m.selectByIndex(6);
        
   //3) For Year.
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select y = new Select(year);
        y.selectByVisibleText("1995");
        //y.selectByValue("1995");
        
        driver.manage().window().minimize();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
