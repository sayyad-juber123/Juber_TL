package makeautomationsoftware;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomePage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.make.com/en/welcome");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("sagarmurthy2751@outlook.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Snabo@2751");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'  Create a new scenario')]")).click();
		
	}

}
