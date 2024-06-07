package larqtechnology;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id = "login_email")
	private WebElement loginEmailTextField;
	
	@FindBy(id = "login_pass")
	private WebElement loginPasswordTextField;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement signInButton;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginEmailTextField() 
	{
		return loginEmailTextField;
	}

	public WebElement getLoginPasswordTextField() 
	{
		return loginPasswordTextField;
	}

	public WebElement getSignInButton() 
	{
		return signInButton;
	}
	
	

}
