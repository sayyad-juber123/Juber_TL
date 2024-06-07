package makeautomationsoftware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistartionPage 
{
	@FindBy(xpath = "//a[text()='Create an account']")
	private WebElement createAccountLink;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement nameTextField;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement emailTextField;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[@class='show-password']")
	private WebElement showPasswordEyeIcon;
	
	@FindBy(xpath = "//span[text()='EU']")
	private WebElement hostingRegion;
	
	@FindBy(xpath = "//span[text()='India']")
	private WebElement countryRegionDropDown;
	
	@FindBy(xpath = "//button[text()='Sign up for FREE']")
	private WebElement signupButton;
	
	public RegistartionPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateAccountLink() 
	{
		return createAccountLink;
	}

	public WebElement getNameTextField() 
	{
		return nameTextField;
	}

	public WebElement getEmailTextField() 
	{
		return emailTextField;
	}

	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}

	public WebElement getShowPasswordEyeIcon() 
	{
		return showPasswordEyeIcon;
	}

	public WebElement getHostingRegion() 
	{
		return hostingRegion;
	}

	public WebElement getCountryRegionDropDown() 
	{
		return countryRegionDropDown;
	}

	public WebElement getSignupButton() 
	{
		return signupButton;
	}
	
	

}
