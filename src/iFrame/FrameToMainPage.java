package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameToMainPage {

	public static void main(String[] args) throws InterruptedException
	{
		//iFrame it is nothing but the frame on another webpage.
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://skpatro.github.io/demo/iframes/");
         
         Thread.sleep(2000);
         
       //first we click on main page .
         
         String text1 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
         System.out.println(text1);
         
       //Main page to SwitchTo frame1.
         
         driver.switchTo().frame("Frame1"); //frame by text.
         String text2 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
         System.out.println(text2);
         
       //Frame1 to switchTo main page.
         //here we use 2 method 
         //1st parent frame and 2nd one in below we see
         
         driver.switchTo().parentFrame();
         //but here first time we use linked text locator.
         String text3 = driver.findElement(By.linkText("Blogger")).getText();
         System.out.println(text3);
         
         //Now again we move .
       //Main page to switchTo frame 2.
         
         driver.switchTo().frame(1); //frame by index.
         String text4 = driver.findElement(By.linkText("Category3")).getText();
         System.out.println(text4);
         
       //frame 2 to main page.
         
         driver.switchTo().parentFrame();
         String text5 = driver.findElement(By.linkText("Pavilion")).getText();
         System.out.println(text5);
         
	}

}
