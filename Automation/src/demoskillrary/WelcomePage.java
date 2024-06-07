package demoskillrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	@FindBy(linkText = "SIGNUP")
	private WebElement signUpLink;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "(//input[@placeholder='Email'])[2]")
	private WebElement emailTextField;
	
	@FindBy(xpath = "(//input[@placeholder='Password'])[2]")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	private WebElement confirmPasswordField;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement registerButton;
	
	
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getSignUpLink() 
	{
		return signUpLink;
	}


	public WebElement getFirstNameTextField() 
	{
		return firstNameTextField;
	}


	public WebElement getLastNameTextField() 
	{
		return lastNameTextField;
	}


	public WebElement getEmailTextField() 
	{
		return emailTextField;
	}


	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}


	public WebElement getConfirmPasswordField() 
	{
		return confirmPasswordField;
	}


	public WebElement getRegisterButton() 
	{
		return registerButton;
	}
	
	

}
