package KitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	//This class take without main method. only we execute in main method.
	
	//1. Data Members or Variables.
	@FindBy (id = "userid") private WebElement userName;
	@FindBy (id = "password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;

	//2. Constructor with parameter.
	public KiteLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods
	public void sendUserName(String UserName) 
	{
		userName.sendKeys(UserName);
	}
	
	public void sendPassword(String passWord) 
	{
		password.sendKeys(passWord);
	}
	
	public void clickOnLoginButton() 
	{
		loginButton.click();
	}
	
	
	
}
