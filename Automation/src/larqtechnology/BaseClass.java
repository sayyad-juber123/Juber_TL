package larqtechnology;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public static WebDriver driver;
	
	public FileInputStream fis;
	public Properties prop;
	
	public WelcomePage wp ;
	public LoginPage lp;
	public HomePage hp ;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		
		fis = new FileInputStream("./testdata/commondata.properties");
		
		prop = new Properties();
		
		prop.load(fis);
		String URL = prop.getProperty("url");
		
		
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		
		wp= new WelcomePage(driver);
		wp.getLoginLink().click();
	}
	
	@BeforeMethod
	public void login()
	{
		String Email = prop.getProperty("email");
		String Password = prop.getProperty("password");
		
		lp = new LoginPage(driver);
		lp.getLoginEmailTextField().sendKeys(Email);
		lp.getLoginPasswordTextField().sendKeys(Password);
		lp.getSignInButton().click();
	}
	
	@AfterMethod
	public void logout()
	{
		hp = new HomePage(driver);
		hp.getSignOutButton().click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
