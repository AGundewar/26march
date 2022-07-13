package WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPLtableEg {

	public static void main(String[] args) throws InterruptedException
	{
		// From IPL site we count number row and column.
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			        
	    driver.get("https://www.iplt20.com/points-table/men/2022");
	    driver.manage().window().maximize();
			        
	    Thread.sleep(2000);	
	    
	 // How to find number of Rows in table.
	    
	    List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
	    int numOfRows = rows.size();
	    System.out.println("Total numbers of rows "+numOfRows);
	    
	    System.out.println("=======================");
	    
     // How to find number of columns in tables.
	    
	    List<WebElement> columns = driver.findElements(By.xpath("(//table//tr[1])[1]//th"));
        int numOfColumns = columns.size();
        System.out.println("Total numbers of colums "+numOfColumns);
        
        System.out.println("=======================");
        
     // How to read header of column.
        
        for(WebElement header:columns)
	    {
	    	System.out.println(header.getText()+"");
	    }
	    
	    System.out.println("=======================");
	    
	 // How to read all the rows from the tables
	    
	    List<WebElement> AllRowsData = driver.findElements(By.xpath("//table//tr"));
        Iterator<WebElement> it = AllRowsData.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next().getText()+""); //we want print one by one
        	System.out.println();
        }
        
        
        
        
        
        
	}

}
