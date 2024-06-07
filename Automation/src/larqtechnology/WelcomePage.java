package larqtechnology;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	@FindBy(linkText = "Create account")
	private WebElement createAccountLink;
	
	@FindBy(xpath = "(//a[@class='navigation-account'])[2]")
	private WebElement loginLink;
	
	
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateAccountLink() 
	{
		return createAccountLink;
	}


	public WebElement getLoginLink() 
	{
		return loginLink;
	}


	
	
	

}
