package ListenerBrowserWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility1
{
	//1) Take Screenshot
//	    a) Write method for it.
	//2) read data using PropertyFile.
//	    a)first create prop file
//      b)Store data into it
//	    c)write method for reading that data

	

	public static String getDataFromPropFile(String key) throws IOException
	{
		//Create object of properties class.
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\Akshay\\PropertyFile.properties");
		p.load(fis);
		String value = p.getProperty(key);
		return value ;
	}

}
