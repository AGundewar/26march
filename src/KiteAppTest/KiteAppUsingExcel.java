package KiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		// In manual we show our data i.e Id, Password and Pin.
		// But in Excel we put our data in excel and here show only row and cell number.
		
        File myfile = new File("C:\\\\Users\\\\Akshay\\\\Contacts\\\\Desktop\\\\Selenium\\\\ExcelEg1.xlsx");
        
	    Row rowGiven = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(0); 
		
	    String UN = rowGiven.getCell(0).getStringCellValue();
	    String PWD = rowGiven.getCell(1).getStringCellValue();
	    String PIN = rowGiven.getCell(2).getStringCellValue();
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	    WebElement userID = driver.findElement(By.id("userid"));
	    WebElement passWord = driver.findElement(By.id("password"));
	    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

	    userID.sendKeys(UN);
	    Thread.sleep(500);
	    passWord.sendKeys(PWD);
	    Thread.sleep(500);
	    loginButton.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement pin = driver.findElement(By.id("pin"));
	    WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    
	    pin.sendKeys(PIN);
	    Thread.sleep(500);
	    continueButton.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
	    
	    String actualUserId = userName.getText();
	    String expectedUserId = UN;
	    
	    if(actualUserId.equals(expectedUserId))
	    {
	    	System.out.println("User ID matching TestCase is PASSED.");
	    }
	    else
	    {
	    	System.out.println("User ID not matching TestCase is FAILED.");
	    }
	    
	    Thread.sleep(2000);
	    
	    userName.click();
	    Thread.sleep(500);
	    
	    driver.findElement(By.xpath("//a[@target='_self']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.close();


	}

}
