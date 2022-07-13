package Selenium1stProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //This is upcasting.
		//driver.get("https://www.flipkart.com/");
		//driver.get("https://vctcpune.com/");
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
	    //By giving input we directly click on radio3.
		
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Hi everyone.");
	}

}