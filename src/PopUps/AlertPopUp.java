package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		// Here we takes example of Demo QA.
		// Here popup only black and white form.
		// in this we have only ok, cancel, text, ?, ! .
		// Here we can not do inspect.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			        
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
			        
	    Thread.sleep(2000);
	    
	    //# we click on 1st click of demo.
	    driver.findElement(By.id("alertButton")).click();
	    Thread.sleep(2000);
	
	//1) To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax.
	    Alert alt1 = driver.switchTo().alert();
	    
	//2) Alert is an interface which contain abstract methods like,
//	    a) accept(): use to click on ok button.
//      b) dismiss(): use to click on cancel Button.
//      c) getText(): use to get text present in a alert popup.
	    
	    System.out.println(alt1.getText()); // because after accept this is not use.
	    alt1.accept(); // to click on OK button.
	    
	    Thread.sleep(2000);
	    
	    //# we click on 3rd click of demo.
	    driver.findElement(By.id("confirmButton")).click();
	    Thread.sleep(2000);
	    
	    Alert alt3 = driver.switchTo().alert();
	    System.out.println(alt3.getText());
	    alt3.dismiss(); //to cancel the popup.
	    
	    driver.findElement(By.id("promtButton")).click();
	    Thread.sleep(2000);
	    Alert alt4 = driver.switchTo().alert();
	    alt4.sendKeys("Hello guys.");
	    Thread.sleep(2000);
	    alt4.accept();
	    
	   
	    
	   




	}

}
