package TestNGSeriesAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myExecution1 {
  @Test
  public void velocity()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize(); 
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    
  }
}
