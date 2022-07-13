package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException
	{
		// Here at a time we select 2 or more than property.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the multi selectable tab.
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        //1) we create listbox to store reference variable. 
        WebElement multiSelectable = driver.findElement(By.name("cars"));

        //2) create object will accept reference variable.
        Select s = new Select(multiSelectable);
        
        //3) printing statement.
        System.out.println("Multi Select status is "+s.isMultiple());
        
        s.selectByVisibleText("Volvo");
        Thread.sleep(1000);
        s.selectByIndex(2);
        Thread.sleep(1000);
        s.selectByValue("saab");
        Thread.sleep(1000);
        s.selectByIndex(3);
        
        //Now we have deselect method. & this use only when there is multiselected method.
        //i.e s.deselectAll();
        Thread.sleep(1000);
        s.deselectByValue("opel");
        Thread.sleep(1000);
        s.deselectByIndex(0);
        Thread.sleep(1000);
        s.deselectByVisibleText("Audi");
        Thread.sleep(1000);
        s.deselectByIndex(1);
        
        
        //System.out.println(s.getFirstSelectedOption().getText());
        
        s.getAllSelectedOptions();
        
     }

}
