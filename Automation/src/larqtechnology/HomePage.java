package larqtechnology;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//button[text()='Shop all']")
	private WebElement shopAllButton;
	
	@FindBy(xpath = "//div[text()='Purification']")
	private WebElement purificationFunction;
	
	@FindBy(xpath = "(//div[@class='shopCard_content']/..//img[@alt='LARQ Bottle PureVis™ Monaco Blue'])[1]")
	private WebElement bottleImage;
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	private WebElement addToCartButton;
	
//	@FindBy(xpath = "//button[@aria-label='Open cart slide out']")
//	private WebElement navigationCart;
	
	@FindBy(xpath = "//button[text()='Check out now']")
	private WebElement checkOutNowButton;
	
	@FindBy(xpath = "//button[text()='Sign Out']")
	private WebElement signOutButton;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getShopAllButton() 
	{
		return shopAllButton;
	}

	public WebElement getPurificationFunction() 
	{
		return purificationFunction;
	}

	public WebElement getBottleImage() 
	{
		return bottleImage;
	}

	public WebElement getAddToCartButton() 
	{
		return addToCartButton;
	}
	
//    public WebElement getNavigationCart() 
//    {
//    	return navigationCart;
//	}

	public WebElement getCheckOutNowButton() 
	{
		return checkOutNowButton;
	}


	public WebElement getSignOutButton() 
	{
		return signOutButton;
	}
	
	
	
}
