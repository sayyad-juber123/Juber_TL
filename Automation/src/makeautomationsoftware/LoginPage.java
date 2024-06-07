package makeautomationsoftware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement emailTextField;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement signinButton;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextField() 
	{
		return emailTextField;
	}

	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}

	public WebElement getSigninButton() 
	{
		return signinButton;
	}
	
	

}
