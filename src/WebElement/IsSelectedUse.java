package WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException
	{
		//6) IsSelected is nothing but here we see that contain is selected or not
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        //Here open the tab
        driver.get("https://vctcpune.com/selenium/practice.html");
        
        Thread.sleep(2000);
        
        //Now without finding xpath we can get webElement by using name and id method.
        WebElement checkbox2 = driver.findElement(By.name("checkBoxOption2"));
        
   //1) first we cannot select check box directly.
        
        if(checkbox2.isSelected())
        {
        	System.out.println("Checkbox is already selected.");
        }
        else
        {
        	checkbox2.click();
        	System.out.println("Checkbox is now selected");
        }
        
//   //2) Now we select check box directly
//        WebElement checkbox3 = driver.findElement(By.name("checkBoxOption3"));
//        
//        checkbox3.click();
//        
//        if(checkbox3.isSelected())
//        {
//        	System.out.println("Checkbox is already selected.");
//        }
//        else
//        {
//        	System.out.println("Checkbox is now selected");
//        }
        
        
        
        
        
        
	}

}
