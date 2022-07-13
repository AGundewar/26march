package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	// Here we create seperate class for seperate page .
	
	//1. Data members or Variables.
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBotton;

	//2. Constructor with Parameter
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods
	public void sendPin()
	{
		PIN.sendKeys("982278");
	}
	
	public void clickOnContinueButton()
	{
		continueBotton.click();
	}
	
	
	
	
	
}
