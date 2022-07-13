package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1TestNG {
  @Test  //@Test means Method
  public void myMeyhod() 
  {
	  // To create class the steps are ,
	  // first go on TestNg in down side then select the TestNG class.
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	        
	  driver.get("https://vctcpune.com");
      driver.manage().window().maximize();
      
      //Instead of printing statement we use reporter class.
      Reporter.log("This test are passed");
      Reporter.log("This test are passed work nicely",true); //Generally use this reporter class.
      
   }
  
  @Test  
  public void myMeyhod1()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	        
	  driver.get("https://kite.zerodha.com/");
      driver.manage().window().maximize();
  }
}
