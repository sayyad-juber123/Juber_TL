package demoskillrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public static WebDriver driver;
	WelcomePage wp;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
	}
	
	@BeforeMethod
	public void login()
	{
		wp = new WelcomePage(driver);
		wp.getSignUpLink().click();
		wp.getFirstNameTextField().sendKeys("Sagar");
		wp.getLastNameTextField().sendKeys("Murthy");
		wp.getEmailTextField().sendKeys("sagarmurthy93@gmail.com");
		wp.getPasswordTextField().sendKeys("Snajo@2751");
		wp.getConfirmPasswordField().sendKeys("Snajo@2751");
		wp.getRegisterButton().click();
	}

}
