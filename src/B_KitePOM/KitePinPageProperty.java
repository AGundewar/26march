package B_KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPageProperty 
{
	// Here we create seperate class for seperate page .
	
	//1. Data members or Variables.
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBotton;

	//2. Constructor with Parameter
	public KitePinPageProperty(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods
	public void sendPin(String Pin)
	{
		PIN.sendKeys(Pin);
	}
	
	public void clickOnContinueButton()
	{
		continueBotton.click();
	}
	
	
	
	
	
}
