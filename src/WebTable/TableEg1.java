 package WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		// Here we count number row and column.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	        
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	        
	    Thread.sleep(2000);
	    
	 // How to find number of ROWS in table.
	    
	    List<WebElement> rows = driver.findElements(By.xpath("//table//tr")); // if we take tr By default it give first column.
	    
	    int totalNumOfRows = rows.size();
	    
	    System.out.println("Total number of rows in table "+totalNumOfRows);
	    
	    System.out.println("=======================");
	    
	 // How to find number of columns in table.
	    
	    List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]//th")); //in first row we get the how many column is their.
	    
	    int totalNumOfColumns = column.size();
	    
	    System.out.println("Total number of Column in tables "+totalNumOfColumns);
	    
	    System.out.println("=======================");
	    
	 // How to read header of column.
	    
	    for(WebElement header:column)
	    {
	    	System.out.println(header.getText()+"");
	    }
	    
	    System.out.println("=======================");
	    
	 // How to read all rows from table.
	    
	    List<WebElement> AllrowsData = driver.findElements(By.xpath("//table//tr"));
	    
	    Iterator<WebElement> it = AllrowsData.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next().getText()+"");
	    	System.out.println(); //this statement for all data will come one by one
	    }
	    
	    
	    

	}

}
