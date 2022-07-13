package KitePOMUsingTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateKiteAppUserName {
	
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	 @BeforeClass
	  public void launchBrowser() throws EncryptedDocumentException, IOException
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver(); this we use multiple time thats why it is declear globally.
		 ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("disable-notification");
		 
		 driver = new ChromeDriver(opt);
	     driver.get("https://kite.zerodha.com/");
         driver.manage().window().maximize();
         
         Reporter.log("Launching browser",true);
         // after we move any other page we give wait.
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         
         // Now give location of excel sheet 
         File myfile = new File("C:\\\\Users\\\\Akshay\\\\Contacts\\\\Desktop\\\\Selenium\\\\ExcelEg1.xlsx");
 		 mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	  
	     login = new KiteLoginPage(driver);
	     pin = new KitePinPage(driver);
	     home = new KiteHomePage(driver);
	  
	  }
	
	 @BeforeMethod
	  public void loginToKiteApp()
	  {
		  String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
	      String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		  String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
	      
		  login.sendUserName(UN);
		  Reporter.log("sending username",true);
		  
		  login.sendPassword(PWD);
		  Reporter.log("sending password",true);
		  
		  login.clickOnLoginButton();
		  Reporter.log("clicking on login button",true);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  
		  pin.sendPin(PIN);
		  Reporter.log("sending PIN",true);
		  
		  pin.clickOnContinueButton();
		  Reporter.log("clicking on continue button",true);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  }
	
     @Test
      public void validateUserName()
      {
    	 String expectedUN = mySheet.getRow(0).getCell(0).getStringCellValue();
    	 String actualUN = home.getActualUserName();
         Reporter.log("Validating User Name",true);
         Assert.assertEquals(actualUN, expectedUN, "Actual and Expected UN are not matching TC failed");
         Reporter.log("Actual and Expected UN are matching TC PASSED",true);
      }
 

     @AfterMethod
      public void logoutFromKiteApp() throws InterruptedException
      {
    	 home.clickOnLogoutButton();
    	 Reporter.log("logging out...",true);
      }

  

     @AfterClass
      public void closeBrowser() throws InterruptedException 
      {
    	 Thread.sleep(2000);
    	 Reporter.log("Closing browser",true);
    	 Reporter.log("========END========");
    	 driver.close();
    	 
    	 
      }

}
