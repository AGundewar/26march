package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// This directly we cannot run here we first create xml file,
// in this we have to run.


public class CrossBrowserTesting {
  @Parameters("browserName")
  @Test
  public void myMethod(String name) throws InterruptedException
  {
	  // Here we have to run Two browser at a time i.e chromebrowser and firefoxbrowser.
	  
	  // WebDriver driver = new ChromeDriver() OR FirefoxDriver();
	  // so here WebDriver driver = null; we have to declear globally.
	  
	  WebDriver driver = null;
	  
	  if(name.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\geckodriver.exe");
		  // WebDriver driver = new FirefoxDriver(); this things we declear globally.   
          driver = new FirefoxDriver();	 
	  }
	  
	  else if(name.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  Thread.sleep(2000);
	  driver.close();
  }
}
