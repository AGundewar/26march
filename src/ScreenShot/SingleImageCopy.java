package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SingleImageCopy {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		// Here we have to take screen shot.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        Thread.sleep(2000);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File destination = new File("C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\ScreenShot\\Akshay1.png");
        
        FileHandler.copy(source, destination);
        
	}

}
