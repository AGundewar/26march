package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEX1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			        
	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    driver.manage().window().maximize();
			        
	    Thread.sleep(2000);
	    
	 // Click 1st process.
	    
	    driver.findElement(By.id("alertBox")).click();
	    Thread.sleep(2000);
	    Alert first = driver.switchTo().alert();
	    System.out.println(first.getText());
	    first.accept(); // Here we have only ok button.
	    Thread.sleep(2000);
	    
	 // Click 2nd process.
	    
	    driver.findElement(By.id("confirmBox")).click();
	    Thread.sleep(2000);
	    Alert second = driver.switchTo().alert();
	    System.out.println(second.getText());
	    second.dismiss(); // here we have both ok and cancel button. 
	    
	 // Click 3rd process.
	    
	    driver.findElement(By.id("promptBox")).click();
	    Thread.sleep(2000);
	    Alert third = driver.switchTo().alert();
	    System.out.println(third.getText());
	    third.accept(); 
	    //third.dismiss();
	    
	    
	    


	}

}
