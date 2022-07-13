package KitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	// Here we 1st compare actual result = Expected result and then click on logout button.
	
	//1. Data Members or Variables.
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName; 
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
			
			
	//2. Constructor with Parameter.
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			
			
	//3. Methods.
	public void validateUserName(String ExpectedUserId)
	{
		String expectedUserName = ExpectedUserId;
		String actualUserName = userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Actual and Expected User Id are matching TestCase is passed.");
		}
		
		else {
			System.out.println("Actual and Expected User Id are Not matching TestCase is failed.");
		}
	}
	
	// For TestNG we add something here.
	
	// To get actual user name
	
	public String getActualUserName()
	{
		String actualUserName = userName.getText();
		return actualUserName;
	}
	
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		userName.click();
		Thread.sleep(1000);
		logoutButton.click();
	}
			
		
		
		
		
	

}
