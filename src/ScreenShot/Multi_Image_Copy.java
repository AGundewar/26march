package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Multi_Image_Copy {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		// One image we have to take screenshot multiple time by using random string.
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
//        
//        driver.get("https://kite.zerodha.com/");
//        driver.manage().window().maximize();
//        
//        Thread.sleep(2000);
//        
//        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        
//        //for taking multiple sceenshot of one image we have to pass random string.
//        String str = RandomString.make(3); 
//        
//        //Now give destination of your sceenshot.
//        File destination = new File("C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\ScreenShot\\MultiScreenshot "+str+" .png");
//        
//        FileHandler.copy(source, destination);
//        
        
        //2nd example.
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        //for taking multiple sceenshot of one image we have to pass random string.
        String str1 = RandomString.make(3); 
        
        //Now give destination of your sceenshot.
        File destination1 = new File("C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\ScreenShot\\MultiScreenshot "+str1+" .png");
        
        FileHandler.copy(source1, destination1);
        

	}

}
