package crossBrowserTest;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void myMethod()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\geckodriver.exe");
	   // WebDriver driver = new ChromeDriver();
	  WebDriver driver = new FirefoxDriver();   
	  
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
  }
}
