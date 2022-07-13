package B_KiteUtilityUsingPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityPropertyFile 
{
	//TCID = Test case ID & src = Source & dest = destination
	
	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\ScreenShot\\Akshay1"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		// Create object of properties.
		Properties prop = new Properties();
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\Akshay\\Property.properties");
		prop.load(myfile);
		prop.getProperty(key);
		String value = prop.getProperty(key);
		return value;
	}

}
