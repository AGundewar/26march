package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox {

	public static void main(String[] args) throws InterruptedException
	{
		// Here we study three process of listBox.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/selenium/practice.html");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
   //1) Identify list box to be handle and store it in reference variable.
        WebElement listbox = driver.findElement(By.name("dropdown-class-example"));

   //2) Create an object of select class which will accept WebElement as argument.
        Select s = new Select(listbox);
        
   //3) By using one of the select class methods we can select values form list box like.
        s.selectByVisibleText("Option3");
        
        Thread.sleep(2000);
        s.selectByValue("option1");
        
        Thread.sleep(2000);
        s.selectByIndex(2);
        
        
        
        
        
        
        
        
        
      
	}

}
