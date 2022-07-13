package KitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		// Here we execute the login page.
		File myfile = new File("C:\\\\Users\\\\Akshay\\\\Contacts\\\\Desktop\\\\Selenium\\\\ExcelEg1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		//Now we give location of parameter from excel sheet.
		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);

	    KiteLoginPage login = new KiteLoginPage(driver);
	    login.sendUserName(UN);
	    login.sendPassword(PWD);
	    login.clickOnLoginButton();
	    
	    //Here we move from one page to another page then always give thread.
	    Thread.sleep(2000);
	    
	    KitePinPage pinPage = new KitePinPage(driver);
	    pinPage.sendPin(PIN);
	    pinPage.clickOnContinueButton();
	    
	    //Here we move again another page.
	    Thread.sleep(2000);
	    
	    KiteHomePage home = new KiteHomePage(driver);
	    home.validateUserName(UN);
	    home.clickOnLogoutButton();
	    
	    //Now we closing the application.
	    driver.close();
	    

	}

}
