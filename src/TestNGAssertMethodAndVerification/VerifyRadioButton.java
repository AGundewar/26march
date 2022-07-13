package TestNGAssertMethodAndVerification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void myMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
     
      //Here open the tab
      driver.get("https://vctcpune.com/selenium/practice.html");
      driver.manage().window().maximize();
      
      WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));

      //This why we can do generally but it is time consuming.
      
//      if(radioButton1.isSelected())
//      {
//    	  Reporter.log("TC failed Radio Button is Selected",true);
//      }
//      else
//      {
//    	  Reporter.log("TC failed Radio Button is not Selected",true);
//      }
      //Like that we do.
      
      //But appart from this we have one method i.e Assert.
      //By using assert . the code is off only one line.
      
      Assert.assertTrue(radioButton1.isSelected(), "Radio button is not selected TC is failed");
  
  }
}
