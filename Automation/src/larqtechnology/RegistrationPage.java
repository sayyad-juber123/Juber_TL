package larqtechnology;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	@FindBy(id = "email")
	private WebElement emailTextField;
	
	@FindBy(id = "password")
	private WebElement passwordTextField;
	
	@FindBy(id = "passwordConfirm")
	private WebElement confirmapsswordTextField;
	
	@FindBy(id = "country")
	private WebElement countryDropDown;
	
	@FindBy(id = "firstName")
	private WebElement firstNameTextField;
	
	@FindBy(id = "lastName")
	private WebElement lastNameTextField;
	
	@FindBy(id = "addressLineOne")
	private WebElement addressLineOneTextField;
	
	@FindBy(id = "addressLineTwo")
	private WebElement addressLineTwoTextField;
	
	@FindBy(id = "company")
	private WebElement companyTextField;
	
	@FindBy(id = "suburbCity")
	private WebElement suburbCityTextField;
	
	@FindBy(id = "stateProvince")
	private WebElement stateProvinceTextField;
	
	@FindBy(id = "zipPostcode")
	private WebElement zipCode;
	
	@FindBy(id = "phoneNumber")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath = "//button[text()='Create account']")
	private WebElement createAccountButton;
	
	
	public RegistrationPage(WebDriver driver) 
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


	public WebElement getConfirmapsswordTextField() 
	{
		return confirmapsswordTextField;
	}


	public WebElement getCountryDropDown() 
	{
		return countryDropDown;
	}


	public WebElement getFirstNameTextField() 
	{
		return firstNameTextField;
	}


	public WebElement getLastNameTextField() 
	{
		return lastNameTextField;
	}


	public WebElement getAddressLineOneTextField() 
	{
		return addressLineOneTextField;
	}


	public WebElement getAddressLineTwoTextField() 
	{
		return addressLineTwoTextField;
	}


	public WebElement getCompanyTextField() 
	{
		return companyTextField;
	}


	public WebElement getSuburbCityTextField() 
	{
		return suburbCityTextField;
	}


	public WebElement getStateProvinceTextField() 
	{
		return stateProvinceTextField;
	}


	public WebElement getZipCode() 
	{
		return zipCode;
	}


	public WebElement getPhoneNumberTextField() 
	{
		return phoneNumberTextField;
	}


	public WebElement getCreateAccountButton() 
	{
		return createAccountButton;
	}


	
	

}
